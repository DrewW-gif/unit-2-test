public class KillCilantro {
   public static String killCilantro(String sentence) {
      String parsley = "parsley";
      String cilantro = "cilantro";
      String space = " ";
      String newSentence = "";
      String word = "";
      int k = 0;
      int v;
         for (int i = 0; i < sentence.length(); i += k) {
            k = 0;
            for (v = i; v < space.indexOf(sentence.substring(i, i + 1)); v++) {
            }
            if (sentence.substring(i, v) == cilantro) {
               newSentence += parsley;
               word = sentence.substring(i, v);
               k = word.length();
               word = "";
            }
            else {
               newSentence += sentence.substring(i, v);
               word = sentence.substring(i, v);
               k = word.length();
               word = "";
            }
         }
      return newSentence;
   }
   public static void main(String[] args) {
      System.out.println(killCilantro("cilantro is clearly the best."));
   }
}