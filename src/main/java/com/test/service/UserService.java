package com.test.service;

import com.test.entity.User;
import com.test.exception.InsurancePolicyRejected;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {

        String[] wordsToCheck = { "Heart", "Kidney", "Liver", "Brain", "Eyes"};
        try {
            for(String word: wordsToCheck) {
                if(user.getExistingMedicalConditions().contains(word)) {
                    throw new InsurancePolicyRejected("The following pre-existing condition can’t be \n" +
                            "covered with a new policy. 1. Heart, 2. Kidney, 3. Liver, 4. Brain, 5. Eyes");
                }
            }
        }
        catch (InsurancePolicyRejected e) {
            System.err.println("Insurance policy rejected: " + e.getMessage());
            throw e;
        }
        catch (Exception e) {
            System.err.println("An error occurred while saving the user: " + e.getMessage());
            throw e;
        }
        return (User) userRepository.save(user);
    }
}
