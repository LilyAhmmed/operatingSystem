# operatingSystem
# RR Round Robin is an algorithm used in time sharing (multitask operating systems) for example if you are working on your laptop, listening to music,using internet,downloading apps and the background processes running.All these processes may appear to work parallel(at the same time ) but in fact it uses Time Quantum, RR looks like FCFS but with quantum time (period of time for which process can run uninterrupted in pre-emptive operating Systems) .The criteria of this algorithm is Arrival time+time quantum (the process continue execution until time quantum expire). In this case there are two options : either the process finish during the given quantum time or it will need to reenter the queue more than one time. 
# Completion Time: refers to when a process is completed.
# Turn Around Time: represents the difference between completion and arrival times. Turn Around Time = Completion Time – Arrival Time.
# Waiting Time: It measures the time difference between turnaround time and burst time. Waiting Time = Turn Around Time – Burst Time.
# Response Time : measures the difference between the start of the process and Arrival time. response time = Start of process- Arrival time.
# SJF  is an algorithm in which the process having the smallest execution time is chosen for the next execution. SJF Scheduling is associated with each job as a unit of time to complete. This algorithm method is helpful for batch-type processing, where waiting for jobs to complete is not critical.Associate with each process the length of its next CPU burst.  Use these lengths to schedule the process with the shortest time
# SJF is optimal – gives minimum average waiting time for a given set of processes
# The difficulty is knowing the length of the next CPU request
