package com.randomProblems;

import java.util.*;
public class Hello {
    static int dfs(Map<String,Set<String>>map,String fam,Set<String> set){
        Queue<String> que=new LinkedList<>();
        que.add(fam);
        int count=1;
        while(!que.isEmpty()){
            count++;
            fam=que.poll();
            for(String mem:map.get(fam)){
            if(!set.contains(mem)){
                que.add(mem);
                set.add(mem);
            }
        }
    }
        return count;
    }
    static void dfsp(Map<String,Set<String>>map,String fam,Set<String> set){
        Queue<String> que=new LinkedList<>();
        que.add(fam);
        
        int count=1;
        while(!que.isEmpty()){
            count++;
            fam=que.poll();
            System.out.print(fam+" ");
            set.add(fam);
            for(String mem:map.get(fam)){
            if(!set.contains(mem)){
                que.add(mem);
                set.add(mem);
            }
        }
    }
        
    }
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	Map <String ,Set<String>> map=new HashMap<>();
    for(int ind=0;ind<N;ind++){
        String str1=sc.next();
        String str2=sc.next();
        Set<String> set=map.getOrDefault(str1,new HashSet<>());
        set.add(str2);
        map.put(str1,set);
        set=map.getOrDefault(str2,new HashSet<>());
        set.add(str1);
        map.put(str2,set);
    }
    Set<String> set=new HashSet<>();
    int count=0,count1=0,max=0;
    String max1="";
    for(String fam:map.keySet()){
        System.out.println(set);
        if(!set.contains(fam)){
            count++;
            count1=dfs(map,fam,set);
            if(max<count1){
                max1=fam;
                max=count1;
                count1=0;
            }
        }
    }
    Set<String>set1=new HashSet<>();
    System.out.println(count1);
    dfsp(map,max1,set1);
	}
}