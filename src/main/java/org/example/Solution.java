package org.example;

public class Solution {

    /**
     * Calculates the number of employees who met or exceeded the target hours.
     *
     * @param hours  An array of integers representing the working hours of employees.
     * @param target The target hours that employees should meet or exceed.
     * @return The number of employees who met or exceeded the target hours.
     */
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int val : hours) {
            if (val >= target) {
                count++;
            }
        }
        return count;
    }
}
