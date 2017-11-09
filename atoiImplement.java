# Let-s-code
########ATOI IMPLEMENTATION
/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete this method */
class GfG
{
    int i=0;
    int flag=0;
    int atoi(String str)
    {
	if(str.charAt(i)=='-'){
	   flag=1;
	   i++;
	}

	int res=0;
	for(;i<str.length();i++){
	    
	    if(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9)
	        res = res*10 + (str.charAt(i)-'0');
	       else 
	         return -1;
	}
	if(flag==1)
	    return -1*res;
	else
	return res;
    }
}
