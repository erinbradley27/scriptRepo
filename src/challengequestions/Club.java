
package challengequestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Club {
    private ArrayList<Member> members;
    private Scanner in;
    
    public Club(String memberListFile)
    {
        members = new ArrayList();
        try{
            in = new Scanner(new File(memberListFile));
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file spceified");
            System.exit(1);
        }
        while(in.hasNextLine())
        {
            Member member = new Member(in.nextLine().split(","));
            members.add(member);
        }
        
        if(in != null)
            in.close();
    }
    
    public void addMember(String name, String password)
    {
        Member member = new Member(name, password);
        members.add(member);
    }
    
    public boolean checkMembership(String name, String password)
    {
        return members.contains(new Member(name, password));
    }

}
