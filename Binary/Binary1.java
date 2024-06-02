public class Binary1 {
    // Method to toggle a bit at position 'pos' in number 'n'
    public static int toggleBit(int n, int pos) {
        // XOR the number with a bit mask where only the bit at 'pos' is set
        return n ^ (1 << pos);
    }

    public static void main(String[] args) {
        int n = 29; // example number
        int pos = 3; // example position

        System.out.println("Original number: " + n);
        System.out.println("Binary representation: " + Integer.toBinaryString(n));

        // Toggle the bit at position 'pos'
        int toggledNumber = toggleBit(n, pos);

        System.out.println("Number after toggling bit at position " + pos + ": " + toggledNumber);
        System.out.println("Binary representation after toggle: " + Integer.toBinaryString(toggledNumber));
    }
}
