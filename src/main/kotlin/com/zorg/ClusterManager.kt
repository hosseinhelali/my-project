package com.zorg

import org.apache.zookeeper.Watcher
import org.apache.zookeeper.ZooKeeper
import org.apache.zookeeper.data.Stat

class ClusterManager {

    fun getLeaderNodeData(){
        var zkClient = ZooKeeper("localhost", 5000, Watcher {

        })

        if ( zkClient.exists("/election", false) == Stat()) {
            throw RuntimeException("No node /election2 exists");
        }
    }
}