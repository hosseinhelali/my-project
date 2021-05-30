package com.zorg

import org.apache.zookeeper.Watcher
import org.apache.zookeeper.ZooKeeper

class ClusterManager {

    fun getLeaderNodeData(){
        var zkClient = ZooKeeper("localhost", 5000, Watcher {

        })

//        if ( zkClient.exists("/election", true)) {
//            throw RuntimeException("No node /election2 exists");
//        }
    }
}