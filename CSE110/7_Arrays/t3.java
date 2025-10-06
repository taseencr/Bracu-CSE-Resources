public class t3{
  public static void main(String[] args){
    String[] email_list = {"abc@gmail.com", "!@cv.bd",  "123cse@bracu.ac.bd"};
    int count = 0;
    
    for(int i=0; i<email_list.length; i++){
      boolean isValid = true;
      String st = email_list[i];
      
      if(!Character.isLetter(st.charAt(0))) isValid = false;
      
      int atIdx = -1;
      int dotIdx = -1;
      for(int j=1; j<st.length(); j++){
        char ch = st.charAt(j);
        if(ch=='@') atIdx = j;
        if(ch=='.') dotIdx = j;
      }
      
      if(!Character.isLetter(st.charAt(atIdx-1)) || atIdx==st.length()-1) isValid = false;
      if(dotIdx<atIdx+2) isValid = false;
      if(dotIdx==st.length()-1) isValid = false;
      
      if(isValid) count++;
    }
    
    System.out.println(count);
  }
}
