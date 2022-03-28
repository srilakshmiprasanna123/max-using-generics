package com.bridgelabz.day11;

class Test<V> {
    // An object of type V is declared
    V obj;
    Test(V obj) { this.obj = obj; } // constructor
    public V getObject() { return this.obj; }
}

// Driver class to test above
class DataTypes {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of float type
        Test<Double> jobj = new Test<Double>(9.0);
        System.out.println(jobj.getObject());

        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
