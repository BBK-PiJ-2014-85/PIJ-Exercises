
class EmployeeDatabase{

private String[] names;
private int[] iDs;
private ArrayCopier arr = new ArrayCopier();
private int count=0;

    public void addItem(String name, int iD)
    {
        if (count==0)
        {
            names = new String[] {name};
            iDs = new int[] {iD};
            count++;
        }
        else
        {
            String[] tempNames = new String[count + 1];
            int[]   tempIDs = new int[count + 1];
            
            arr.copy(names,tempNames);
            names = tempNames;
            arr.copy(iDs,tempIDs);
            iDs = tempIDs;
        
            names[count] = name;
            iDs[count] = iD;
            
            count++;
        }
    }

    public void printSorEven()
    {
        System.out.println("The following employees have an s in thier name or an even ID:");
    
        for (int i = 0; i < count; i++)
        {
            if (containsS(names[i]) || iDs[i] % 2 == 0)
            {
                System.out.println("Employee name: " + names[i] + " ID: " + iDs[i]);
            }
        
        }
    }
    
    private boolean containsS(String s)
    {
        for (int i = 0; i < s.length(); i++)
         {
            if (s.charAt(i) == 's' || s.charAt(i) == 'S') {return true;}
        }
        
    return false;
    
    }
}