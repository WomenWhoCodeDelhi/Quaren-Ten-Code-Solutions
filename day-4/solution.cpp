#include<iostream>
#include<algorithm>
#include<stack>
#include <stdio.h>
#include <math.h>
#include <fstream>

using namespace std;
int ar[1000000];
int main()
{

       int n;
       cin>>n;
       while(n!=0)
       {

           int l;

           cin>>l;
                 for(int i=0;i<l;i++)
           {  
               cin>>ar[i];     //array to store heights of houses
           }
           int* span=new int[l];  //array to store the answer
           std::stack<int> st;   //stack to store INDICES of array "ar"
           span[0]=1;                
           st.push(0);
           for(int i=1;i<l;i++)
           {
               while(!st.empty()&&ar[st.top()]<=ar[i])
               {
                   st.pop();                    //pop elements in stack while its non empty and the current height is greater than the height stored at the top of the stack
               }
               if(st.empty())
                   span[i]=i+1;           //when all elements are popped ,span is simply index+1
               else
                   span[i]=i-st.top();    //span is the difference of indices 
               st.push(i);
           }

       for(int i=0;i<l;i++)
       {

           cout<<span[i]<<" ";    //print the answer
       }
           cout<<"\n";
           n--;
       }

}
