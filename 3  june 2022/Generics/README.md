## Use map elements using generics. Here, I pass key and value.


### CODE
```
class Generics {
  public static void main(String args[]){
    Map<Integer,String> map=new HashMap<Integer,String>();
      map.put(1,"Bhavesh");
      map.put(2,"hrishi");
      map.put(3,"ketan");

//Set and Iterator
Set<Map.Entry<Integer,String>> set=map.entrySet();

Iterator<Map.Entry<Integer,String>> itr=set.iterator();
while(itr.hasNext()) {
Map.Entry e=itr.next();

System.out.println(e.getKey()+" "+e.getValue());
    }
  }
}
```

### OUTPUT
```
1 Bhavesh
2 hrishi
3 ketan
```
