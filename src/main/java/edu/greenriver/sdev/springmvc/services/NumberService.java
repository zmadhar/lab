package edu.greenriver.sdev.springmvc.services;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author zahramadhar
 * @version 17.01
 */
@Service
public class NumberService {
    /**
     * @param low low
     * @param high high
     * @return random number
     */
    public int between(int low, int high)
    {

        Random num = new Random();

        return num.nextInt(low, high);
    }
}
