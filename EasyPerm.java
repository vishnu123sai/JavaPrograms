

public class EasyPerm{

private static void permute(String permutation, String remainingCharacters){
if(remainingCharacters==null){
return;
}
else if(remainingCharacters.length()==0){//print permutation for the first character
System.out.println(permutation);
}
for(int i=0;i<remainingCharacters.length();i++)
{
	char f = remainingCharacters.charAt(i);
	System.out.println(permutation+f+"\t\t"+remainingCharacters.substring(0, i)+remainingCharacters.substring(i+1));
	permute(permutation+f,remainingCharacters.substring(0, i)+remainingCharacters.substring(i+1));
}
}


     public static void main(String []args){
       String a ="abc";
       permute("",a);
     }
}

