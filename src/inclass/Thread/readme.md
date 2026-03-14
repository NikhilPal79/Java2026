# THREADS [Threads allows a program to operate more efficiently by doing multiple things at the same time.]

# TWO WAYS TO CREATE THREAD 
1. IMPLEMENTS Runnable [USE THIS ONE ][ the thread can be run by passing an instance of the class to a Thread]
2. EXTENDS Threads 

# WHY IMPLEMENT IS BETTER THAN EXTENDS ?
The major difference is that when a class extends the Thread class, you cannot extend any other class, 
but by implementing the Runnable interface, it is possible to extend from another class as well.


# LIFE CYCLE OF THREAD 
1. NEW → [Thread is created with new Thread() but start() not yet called. It exists in memory but hasn't started executing.]
2. RUNNABLE → [After start() is called. Thread is ready to run and waiting for the CPU scheduler to pick it. It may or may not be actively executing at any moment]
3. RUNNING → BLOCKED/WAITING/TIMED_WAITING → [CPU has assigned time to this thread. run() is actively executing right now.]
4. TERMINATED ->[run() has finished execution either normally or due to an exception. Thread cannot be restarted.]


[BLOCKED] /[Thread tried to enter a synchronized block but another thread holds the lock. It waits until the lock is released]
[WAITING]/[Thread called wait(), join(), or LockSupport.park() with no timeout. It waits indefinitely until another thread calls notify() or notifyAll().]
[TIMED_WAITING]/[Same as WAITING but with a timeout. Caused by sleep(ms), wait(ms), or join(ms). Thread wakes up automatically after the time expires.]


# DAEMON THREAD [SERVICE PROVIDER THREAD THAT PROVIDES SERVICE TO THE USER THREAD ]

# TYPE OF CONCURRENCY PROBLEM 

# Deadlock vs Livelock vs Starvation

1. DEADLOCK [FROZEN FOREVER][Two or more threads are permanently blocked, each waiting for a resource held by the other. Nobody moves. Nobody gives up.]
2. LIVELOCK [BUZY BUT STUCK][Two or more threads are actively running but keep reacting to each other and never make actual progress.CPU is being used but nothing gets done]
3. STARVATION [ALWAYS IGNORED][One thread is perpetually denied CPU time because other higher-priority threads always get resources first.The low-priority thread is alive but never runs.]