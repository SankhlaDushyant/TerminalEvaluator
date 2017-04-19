import java.util.ArrayList;

public class TerminalEvaluator{
    public static ArrayList<String> z = new ArrayList<String>();
    
    public static void Splitter (String m){
        String reg = "->";
        String[] x = m.split(reg);
        String p = x[0];
        String l = x[1];
        if(l.length()==1){
            if(Character.isLowerCase(l.charAt(0))){
                System.out.println(m);
                System.out.println('<'+l+'>'+"->"+l);
                System.exit(0);
                }
            else{
                System.out.print(m);
                }
        }
        else{
            String[] k = l.split(Character.toString(l.charAt(0)));
            p=Character.toString(l.charAt(0));
            String r = k[1];
            if(Character.isLowerCase(p.charAt(0))){
                if(r.length()>1){
                    if(z.size()==0){
                        System.out.println("A"+"->"+'<'+p+'>'+'<'+r+'>');
                    }
                    else
                        System.out.println('<'+l+'>'+"->"+'<'+p+'>'+'<'+r+'>');
                }
                else if(r.length()==1 & Character.isUpperCase(r.charAt(0))){
                    System.out.println('<'+l+'>'+"->"+'<'+p+'>'+r);
                }
                else
                    System.out.println('<'+l+'>'+"->"+'<'+p+'>'+'<'+r+'>');
                z.add(p);
                z.add(r);
            }
            else if(Character.isUpperCase(p.charAt(0))){
                if(r.length()>1){
                    if(z.size()==0){
                        System.out.println("A"+"->"+p+'<'+r+'>');
                    }
                    else
                        System.out.println('<'+l+'>'+"->"+p+'<'+r+'>');
                }
                else if(r.length()==1 & Character.isUpperCase(r.charAt(0))){
                    System.out.println('<'+l+'>'+"->"+p+r);
                }
                else{
                    System.out.println('<'+l+'>'+"->"+p+'<'+r+'>');
                }
                z.add(r);
            }
         }
    }
    public static void main(String a[]){
        String str = "A->aBcdE";
        Splitter(str);
        for(int i=0;i<z.size();i++){
            if(z.get(i).length() ==1 & Character.isLowerCase(z.get(i).charAt(0))){
                System.out.println('<'+z.get(i)+'>'+"->"+z.get(i));
            }
            else if(z.get(i).length()>1){
                str = '<'+z.get(i)+'>'+"->"+z.get(i);
                Splitter(str);
            }
        }
    }
}
