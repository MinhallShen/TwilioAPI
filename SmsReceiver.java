
package com.myproject.starterhacks2020;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;




public class SmsReceiver {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC8cbaad0c48bd4fe5317d17ca25812285";
    public static final String AUTH_TOKEN =
            "df3ca16d2db98941ac3093adff4dbb45";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+16473232569"), // to
                        new PhoneNumber("+19177465846"), // from
                        "TEXT HERE")
                .create();

        System.out.println(message.getSid());
    }
}
