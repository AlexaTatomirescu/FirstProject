public String comboString(String a, String b) {
    if (b.length() < a.length()) {
        String c = a;
        a = b;
        b = c;

    }

    return a + b + a;
}
