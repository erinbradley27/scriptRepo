
package challengequestions;


public class Member {
    private String name;
    private String password;
    
    public Member(String[] info)
    {
        name = info[0];
        password = info[1];
    }
    
    public Member(String name, String password)
    {
        this.name = name;
        this.password = password;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public boolean equals(Object o)
    {
        Member m = (Member) o;
        if(m.getName().equals(this.name) && m.getPassword().equals(this.password))
            return true;
        else
            return false;
    }
}
