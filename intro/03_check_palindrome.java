// https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ

boolean checkPalindrome(String inputString) {
    var mirror = new StringBuilder(inputString).reverse().toString();
    return mirror.equals(inputString);
}
