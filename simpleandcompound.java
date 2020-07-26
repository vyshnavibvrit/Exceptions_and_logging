package com.epam.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
class SimpleAndCompoundInterest_Logging 
{
	private static final Logger LOGGER = LogManager.getLogger(SimpleAndCompoundInterest_Logging.class);
    public double simple_interest(double principal_amount,double time_in_years,double rate_of_interest_inPercentage)
    {
    	return (principal_amount*time_in_years*rate_of_interest_inPercentage)/100;
    }
    public double compound_interest(double principal_amount,double time_in_years,double rate_of_interest_inPercentage)
    {
    	return principal_amount*Math.pow((1+(rate_of_interest_inPercentage)/100),time_in_years)-principal_amount;
    }
    public static void main(String []args)
    {
    	SimpleAndCompoundInterest_Logging s=new SimpleAndCompoundInterest_Logging();
    	LOGGER.info("Principal amount = 100000 :: Time in years = 5 :: Rate of interest(%) = 23 :: Simple Interest = "+s.simple_interest(100000,5,23));
    	LOGGER.info("Principal amount = 200000 :: Time in years = 10 :: Rate of interest(%) = 20 :: Simple Interest = "+s.simple_interest(200000,10,20));
    	LOGGER.info("Principal amount = 100000 :: Time in years = 5 :: Rate of interest(%) = 15 :: Simple Interest = "+s.simple_interest(100000,5,15));
    	LOGGER.info("Principal amount = 50000 :: Time in years = 20 :: Rate of interest(%) = 10 :: Simple Interest = "+s.simple_interest(50000,20,10));   	
    }
}