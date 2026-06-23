package Strings;

public class Maximum_Nesting_Depth_of_Parenthesis {

        public static int maxDepth(String s) {

            int depth = 0;      // current depth
            int maxDepth = 0;   // maximum depth

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                // opening bracket
                if (ch == '(') {

                    depth++; // go one level deeper

                    // update maximum depth
                    maxDepth = Math.max(maxDepth, depth);
                }

                // closing bracket
                else if (ch == ')') {

                    depth--; // come one level back
                }
            }

            return maxDepth;
        }

        public static void main(String[] args) {

            String s = "(1+(2*3)+((8)/4))+1";

            System.out.println("Maximum Depth = " + maxDepth(s));
        }
    }

