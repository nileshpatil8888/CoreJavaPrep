Map :
    A collection that does not allow duplicate elements.
    Common implementations : HashSet, LinkedHashSet, TreeSet.
    Methods : add(), remove(), size() etc.

   Explain Internal working of hashMap ?
    A hash map that stores key value pairs and provides the mechanism for retrieving the values based on their keys.
    and use hashing to store and retrieve the data efficiently.

    contains following core components :
        Buckets :
            internally has map maintains an array of buckets.
            Each bucket is essentially a linked list that contains entries. the number of buckets is determined by the initial capacity.
        Entry :
            Each bucket stores an entry or node that holds the following info
                Key : we need to store or retrieve value.
                value : The value associated with the key.
                Hash: The hash code of the key to determine the bucket location.
                Next : Reference to the next node if the key hashes to the same bucket.
        capacity :
            The number of bucket . this is specified when the hashmap is created, and it increases automatically when the load factor is exceeded.


    Operation :
        When key is inserted java computes its hash code using the hashcode method.
        hashcode object is an integer that represents the objects memory address , though it's not always directly tied to it.
        The hashcode then used to determine the bucket index where the entry should be placed.



    ConcurrentHashmap vs hashMap :
        Hashmap : Hash map is not thread safe.
                  if multiple threads modify a hashmap concurrently without proper synchronization, data corruption can occur.
                  Must be manually synchronized using external mechanism like Collections.synchronizedMap() or wrapping it in a synchronized block.
                  It allows one null key and multiple null values.
                  It is suitable for single threaded applications.
        ConcurrentHashMap :
                It is a thread safe class.
                designed for concurrent access without the need for external synchronization.
                Uses a mechanism fine-grained locking to allow multiple threads to read and write concurrently, improving performance.
                it is not allow null key values.
                ideal for multithreaded applications.
