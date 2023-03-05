public class MaskPII {
    private String maskEmail(String email) {
        int atLocator = email.indexOf('@');
        return email.toLowerCase().charAt(0) + "*****" + email.toLowerCase().charAt(atLocator - 1) + email.substring(atLocator).toLowerCase();
    }

    private String maskPhoneNumber(String phoneNumber) {
        phoneNumber = removeSeparator(phoneNumber);
            if (phoneNumber.length() == 10 ) {
                return "***-***-" + phoneNumber.substring(6, 10);
            } else if (phoneNumber.length() == 11 ) {
                return "+*-***-***-" + phoneNumber.substring(7, 11);
            } else if (phoneNumber.length() == 12 ) {
                return "+**-***-***-" + phoneNumber.substring(8, 12);
            } else {
                return "+***-***-***-" + phoneNumber.substring(9, 13);
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

    private String removeSeparator(String phoneNumber) {
        StringBuilder phone = new StringBuilder(phoneNumber);
        while (isHasSeparator(phone) != -1) {
            phone.deleteCharAt(isHasSeparator(phone));
        }
        return new String(phone);
    }

    private int isHasSeparator(StringBuilder phoneNumber) {
        if (phoneNumber.indexOf("+") != -1) return phoneNumber.indexOf("+");
        if (phoneNumber.indexOf("-") != -1) return phoneNumber.indexOf("-");
        if (phoneNumber.indexOf("(") != -1) return phoneNumber.indexOf("(");
        if (phoneNumber.indexOf(")") != -1) return phoneNumber.indexOf(")");
        if (phoneNumber.indexOf(" ") != -1) return phoneNumber.indexOf(" ");
        return -1;
    }
}