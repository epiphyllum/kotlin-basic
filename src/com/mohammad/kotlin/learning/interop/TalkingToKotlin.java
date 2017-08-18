package com.mohammad.kotlin.learning.interop;

import com.mohammad.kotlin.learning.classes.CustomerKotlin;
import com.mohammad.kotlin.learning.classes.CustomerKotlinKt;
import com.mohammad.kotlin.learning.classes.Status;

import java.io.IOException;

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
public class TalkingToKotlin {

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(0, "Mohammad", "mohammad@email.com");
        customerKotlin.setEmail("weevgrev@egr.com");
        System.out.println(customerKotlin.someField);
        customerKotlin.chageStatus();
        customerKotlin.chageStatus(Status.CURRENT);
        customerKotlin.prefferntial();
        try {
            customerKotlin.loadStatistics("fileName");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(UtilityClass.prefix("ali", "mohammad"));
        System.out.println(UtilityClass.copyrightYear + "");
        CustomerKotlinKt.extension(customerKotlin);
    }

}
