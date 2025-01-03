Concurrency :
    It is executing multiple task simultaneously that's known as concurrency.

Multithreading :
    It is the concept of concurrency and it executes multiple thread in parallel in single process that is the multithreading.
    It improves application performance
    utilizes CPU cores efficiently.
    Handle I/o and cpu bound tasks concurrently.

    Thread :
        Thread is the single process unit.

        Thread Lifecycle :
            New: Thread object is created.
            Runnable: Thread is ready to run but waiting for CPU.
            Running: Thread is executing.
            Blocked/Waiting: Thread is waiting for resources or another thread.
            Terminated: Thread has completed execution

        Thread Creation:
            Extending the Thread class.
            Implementing the Runnable interface.
            Using Callable and Future.

        Thread Management:
            Starting a thread (thread.start()).
            Setting thread priorities.
            Thread sleep and interruption (Thread.sleep(), thread.interrupt()).

     Synchronization
        Why Synchronization? Prevent data inconsistencies when multiple threads access shared resources.
        Synchronized Blocks:
            synchronized(this) or synchronized(object).
        Synchronized Methods:
            public synchronized void methodName().
        Static Synchronization:
            Synchronizing static methods or class-level locks.
        Locking Mechanisms:
            Intrinsic Locks: synchronized.
        Explicit Locks: java.util.concurrent.locks.Lock.

    Deadlocks
        Definition: A situation where two or more threads are waiting indefinitely for resources locked by each other.
        Causes:
            Circular wait.
            Improper lock acquisition order.
        Prevention:
            Avoid nested locks.
            Use lock timeouts.
            Ensure consistent lock order.

    Thread Safety
        Definition: A thread-safe class ensures proper functioning when accessed by multiple threads simultaneously.
        Techniques:
            Synchronization.
            Immutability.
            Thread-local variables (ThreadLocal).
        Concurrent Collections:
            ConcurrentHashMap, CopyOnWriteArrayList, BlockingQueue.
