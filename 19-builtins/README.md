HashMap: 
-implementation of Map 
*Map class maps keys to values
-Key>> value
-duplicate keys not allowed
-allows null values and null keys
-not sychronized
-uses the put() method to add an element to the map

HashSet:
-implementation of Set 
-uses a HashMap to back its implementation
-only non duplicate elements
-overrides equals() and hashcode()
-stores only objects
-uses add() method to add elements 
***slower than HashMap

TreeMap:
-implements Map
-maintains order of objects, unlike HashMap
-stores a key and a value
-duplicates allowed

TreeSet:
-implements Set
-stores only one object
-duplicates not allowed
-sorted

***TreeMap and TreeSet are slower than the hash counterparts

****runtime analysis from hash class
elements	    HashMap         TreeMap
10,000		    25ms	    29ms
100,000		    65ms	    73ms
1,000,000	    536ms	    472ms
10,000,000	    ERROR	    ERROR (java.langOutOfMemory)

The java built in heap is a TreeNode