public class MaskPII {
    private String maskEmail(String email) {
        int atLocator = email.indexOf('@');
        return email.toLowerCase().charAt(0) + "*****" + email.toLowerCase().charAt(atLocator - 1) + email.substring(atLocator).toLowerCase();
    }

    private String maskPhoneNumber(String phoneNumber) {
            if (phoneNumber.length() == 12 ) {
                return "***-***-" + phoneNumber.substring(8, 12);
            } else if (phoneNumber.length() == 15 ) {
                return "+*-***-***-" + phoneNumber.substring(11, 15);
            } else if (phoneNumber.length() == 16 ) {
                return "+**-***-***-" + phoneNumber.substring(12, 16);
            } else {
                return "+***-***-***-" + phoneNumber.substring(13, 17);
            }
    }

    public String maskPII(String pii) {
        // dilakukan pengecekan String pii
        // jika pii merupakan email, panggil method maskEmail
        // jika pii merupakan phone number, panggil method maskPhoneNumber

        if (pii.indexOf('@') != -1) {
            return maskEmail(pii);
        } else {
            return maskPhoneNumber(pii);
        }
    }
}