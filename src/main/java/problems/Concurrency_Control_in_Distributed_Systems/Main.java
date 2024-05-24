package problems.Concurrency_Control_in_Distributed_Systems;

/*
* SCENARIO
* -------------------
* Many concurrent request tries to book the same Movie theatre seat
*
* CRITICAL SECTION :
* ---------------------
* Piece of code where you are trying to access a shared resource
*
* USING SYNCHRONIZED BLOCK
* -----------------------------
* synchronized(){
*   Read Seat Row with ID
*   if free:
*       change status of seat
*       update DB
* }
*
* WILL THIS WORK FOR DISTRIBUTED SYSTEM?
* ----------------------------------------
* ONE PROCESS CAN HAVE MULTIPLE THREADS, SYNCHRONIZED CAN WORK IN THIS CASE
* BUT IN DISTRIBUTED SYSTEM THERE CAN BE MULTIPLE SYSTEMS HAVING MANY PROCESSES, SO SYNCHRONIZED BLOCK WON'T WORK
*
* USING DISTRIBUTED CONCURRENCY CONTROL
* -----------------------------------------
* 1) Optimistic Concurrency Control (OCC)
* 2) Pessimistic Concurrency Control (PCC)
*
* 1) USAGE OF TRANSACTION
* -------------------------
* -> Transaction helps us to achieve INTEGRITY. It helps us to avoid Inconsistency in our DB.
*
* EX:
* -----
* Debit the money from A and Credit the money to B
*
* BEGIN_TRANSACTION:
* ------------------
* Debit the money from A
* Credit the money to B
* If all success:
*   COMMIT;
* else
*   ROLLBACK;
* END_TRANSACTION
* ------------------
*
* 2) DB Locking
* ---------------
* DB Locking makes sure that no other transaction updates the locked rows
*
* TYPES
* --------
* EXCLUSIVE LOCK (X) -> No other transaction can read/write , nor take shared lock nor exclusive lock
* SHARED LOCK (S) -> called read lock, only read can happen, other transactions can take shared lock, but no exclusive lock
*
* 3) ISOLATION LEVELS
* -------------------------
* Isolation Level  | Dirty Read Possible | Non-Repeatable Read Possible | Phantom Read Possible|
* Read Uncommitted |       Yes           |             Yes              |       Yes            |  Consistency High
* Read Committed |         No            |             Yes              |       Yes            |      ^
* Repeatable Read |       No             |              No              |       Yes            |      |
* Serializable   |       No           |                No              |        No             |   Consistency Low
*
* ISOLATION
* -------------
* Isolation says that if you have multiple transactions running concurrently, it feels like they are executing alone, each one is independent of each other
*
*
* DIRTY READ
* -----------
* If Transaction A is reading the data which is being written by B and not yet committed.
* If Transaction B does a rollback, data read by A is known as dirty read.
*
* Non-Repeatable Read
* ----------------------
* If Transaction A reads the same row multiple times and there is a chance that it reads different value
*
* Phantom Read
* -------------------
* If Transaction A executes same query several times and there is a chance that the rows returned are different.
*
*  Isolation Level   | Locking Strategy |
*  Read Uncommitted  | Read : No Lock acquired
*                   |  write : No Lock acquired
*  Read Committed   |  Read : Shared Lock acquired by row and released as soon as Read is done
*                   |  write: Exclusive lock is acquired by row and kept till end of transaction
*  Repeatable Read |   Read : Shared Lock acquired and kept till end of transaction
 *                 |   write: Exclusive lock is acquired and kept till end of transaction
 *                 |  Even though Repeatable Read prevents previously read rows from being modified or deleted by other transactions, it doesn't prevent new rows from being inserted that match the query conditions.
*  Serializable   |   Same as Repeatable read locking strategy + apply range lock and lock is released only at the end of transaction
*                 | range lock means it will lock nearby rows also
* SYNTAX
* ------------
* SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;
* BEGIN TRANSACTION;
*
* END TRANSACTION;
*
*
* OPTIMISTIC CONCURRENCY CONTROL
* ------------------------------
* -> uses Read committed isolation level
* -> we use Version for each row, when you do any update that version increases
* -> before doing any update version validation is done, if version read previously is not equal to the current version number, then ROLLBACK happens
* -> CREATE TRANSACTION -> READ ROW(UNLOCKED TOO) -> COMPUTATION ON FETCHED ROW -> ROW MODIFIED ? -> YES -> ROLLBACK / NO -> UPDATE DB -> COMMIT
*
* POINTS TO NOTE
* ------------------
* Isolation level used below REPEATABLE READ
* Much Higher Concurrency
* No chance of Deadlock
* In case of conflict, overhead of transaction rollback and retry logic is there
*
* PESSIMISTIC CONCURRENCY CONTROL
* ------------------------------
* -> uses Repeatable and Serializable isolation levels, Lock is acquired on row and never released till the end of trqnsaction
* -> DEADLOCK can happen
* -> T1 reads A, T2 reads B, T1 wants to Write B, T2 wants to write A, both are waiting for the other to release the shared lock, so deadlock happens, they will get aborted and they might have to start again
* -> CREATE TRANSACTION -> READ ROW(UNLOCKED TOO) -> COMPUTATION ON FETCHED ROW -> ROW MODIFIED ? -> YES -> ROLLBACK / NO -> UPDATE DB -> COMMIT
*
* POINTS TO NOTE
* -----------------
* Isolation level used Repeatable Read and Serializable read
* Less concurrency compared to Optimistic
* Deadlock is possible, then transactions stuck in deadlock are forced to do rollback
* Putting a long lock, sometimes timeout issue comes and rollback needs to be done
* */
public class Main {
    public static void main(String[] args) {

    }
}
