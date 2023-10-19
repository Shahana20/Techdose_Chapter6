class Solution {
    public int minOperations(String[] logs) {
        Stack <String> folder = new Stack<>();
        for(int i = 0; i < logs.length ; i++)
        {
            if(logs[i].equals("./"))
            {
                continue;
            }
            else if(logs[i].equals("../"))
            {
                if(!folder.isEmpty()){
                    folder.pop();
                }
                
            }
            else
            {
                folder.push(logs[i]);
            }
        }
        return folder.size();
    }
}