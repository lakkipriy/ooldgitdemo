package usingstrings;

public class Strings {

	
		public void reversethestring(String s){


			String word[]=s.split(" ");

			for(int i=0;i<word.length;i++){

			char ch[]=word[i].toCharArray();

			String reverse="";

			for(int j=ch.length-1;j>=0;j--){

			reverse=reverse+ch[j];
			}
			System.out.print(reverse+" ");
			}// TODO Auto-generated method stub
	}
public static void main(String args[])
{
	Strings obj=new Strings();
	obj.reversethestring("my name is lakshmi priya");
}
}
