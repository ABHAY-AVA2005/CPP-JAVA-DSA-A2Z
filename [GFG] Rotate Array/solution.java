            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        for(int i=0;i<n1/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n1-i-1];
            arr[n1-i-1]=temp;
        }
        
                
        for(int i=0;i<n2/2;i++)
        {
            int temp=arr[n1+i];
            arr[n1+i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        
    }
}