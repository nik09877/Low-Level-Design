package problems.Distributed_Cache_Mechanism;

//TODO TODO TODO TODO TODO TODO TODO TODO TODO
/*
* REQUIREMENTS
* ---------------
* -> Access Data (GET)
* -> UPDATE DATA (WRITE) (When -> Write Policies -> Write Back, Write Through)
* -> EVICT DATA (DELETE) (WHEN -> Expiration of Timer, Deleting the least Useful Entry)
*
* WRITE-BACK
* ------------
* -> In Write back when client updates data in the cache the cache holds onto it, because what if the
* client is making many updates to the same data, so it waits for some time and then sends the update to DB
* -> Problem is other caches don;t know the updated value, because the DB still holds the old value
* -> If power loss happens then the updated data held in the cache will be lost
* -> It is more efficient because of less calls to DB and has less consistency
*
* WRITE-THROUGH
* -------------------
* -> In Write Through, when the client updates the cache, it synchronously updates the DB
* so that the other caches can atleast pull the new data or get notified by the DB that the data has changed
*
*
* WE ARE GOING TO BE USING Read your own writes For GET
* ----------------------------------------
* When a write operation is taking place on A, block other read/write requests on A only so that
* they can get the updated value
*
* For CREATE
* ----------------------------
* -> use REPLACEMENT ALGORITHMS
*
* CORE REQUIREMENTS
* --------------------
* -> Read your own writes
* -> Multiple write policies - Write-back, Write-through
* -> Expiration Time
* -> Multiple replacement algorithms - LRU, LFU
* -> Asynchronous Processing
* -> Request Collapsing (condense multiple calls to cache for the same key into one, Rate Limiting)
* -> Hot Loading (Pre-fetching)
* -> Event Logging
* -> Async Results
*
* SHOULD ALLOW
* ---------------
* listeners on load and evict
* hot loading elements on startup
* multiple eviction algorithms like LRU and LFU
* expiration time
* multiple fetch algorithms like write back and write through
* return futures
* request collapsing
*
*
*
*
*
*
*
*
* */

public class Main {

}
