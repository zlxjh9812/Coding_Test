class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        char end = s.charAt(s.length() - 1);
      
        String result = "";
        for (int i = 0; i < arr.length; i++) {
          
            for (int j = 0; j < arr[i].length(); j++) {
                char c = arr[i].charAt(j);
                
                if (j == 0) {
                    c = Character.toUpperCase(c);
                } else {
                    c = Character.toLowerCase(c);
                }

                result += c;
            }
            result += " ";
        }

      
        if (end == ' ') {
            return result;
        }

        return result.trim();
    }
}