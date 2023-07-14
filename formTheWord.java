public class Main{

public static void main(String[] args){
System.out.println(formTheWord("ww.ii:pp:rг:oo"));
}

public static String formTheWord(String input1){

String[] words = input1.split(":"); 
StringBuilder output = new StringBuilder();

for (String word : words) {
if(word.charAt(0)=-word.charAt(1)){ 
output.append(word.charAt(0));
}else{
int pos1 = word.charAt(0)-'a';
int pos2= word.charAt(1)-'a'; 
int diff = Math.abs(pos1-pos2);

int selectedPos = diff-1;
char selectedChar = (char) ('a' + selectedPos); 
output.append(selectedChar);
}
}
return output.toString().toUpperCase();
}
}
}
