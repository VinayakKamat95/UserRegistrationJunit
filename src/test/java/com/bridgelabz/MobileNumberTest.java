package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/*To Declare the class will be Parameterized class*/
@RunWith(Parameterized.class)
public class MobileNumberTest {

    //*initializing fields mobile_number and expected(result boolean)*//
    String mobile_number;
    boolean expected;

    //*Constructor created to provide current object value*//
    public MobileNumberTest(String mobile_number, boolean result) {
        this.mobile_number = mobile_number;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputMobile method*/
    @Parameterized.Parameters
    public static List inputMobile(){
        List list = new ArrayList();
        list.add(new Object[]{"91 9876543210",true});
        list.add(new Object[]{"91 987654",false});
        list.add(new Object[]{"9874561230",false});
        list.add(new Object[]{"919876544123",false});
        return list;
    }

    //*Object of validator class created
    // checking validateMobileNumber methods result with expected result using equals method*//
    @Test
    public void validateMobileNumber() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validateMobileNumber(this.mobile_number));
    }

}
