/*
 * ******************************************************************************
 *  Copyright 2019 Korea University & Open Networking Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ******************************************************************************
 *  Developed by Libera team, Operating Systems Lab of Korea University
 *  ******************************************************************************
 */
package net.onrc.openvirtex.messages.statistics;

import net.onrc.openvirtex.elements.datapath.OVXSwitch;
import net.onrc.openvirtex.elements.datapath.PhysicalSwitch;
import net.onrc.openvirtex.messages.OVXStatisticsReply;
import net.onrc.openvirtex.messages.OVXStatisticsRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.projectfloodlight.openflow.protocol.OFMessage;
import org.projectfloodlight.openflow.protocol.OFPortDescStatsReply;
import org.projectfloodlight.openflow.protocol.OFStatsType;

public class OVXPortDescStatsReply extends OVXStatistics implements
        VirtualizableStatistic, DevirtualizableStatistic {

    Logger log = LogManager.getLogger(OVXPortDescStatsReply.class.getName());

    protected OFPortDescStatsReply ofPortDescStatsReply;

    public OVXPortDescStatsReply(OFMessage ofMessage) {
        super(OFStatsType.PORT_DESC);

        if(ofMessage != null) {
            this.ofPortDescStatsReply = (OFPortDescStatsReply)ofMessage;
        }
    }



    @Override
    public void devirtualizeStatistic(OVXSwitch sw, OVXStatisticsRequest msg) {
        this.log.info("devirtualizeStatistic");

    }

    @Override
    public void virtualizeStatistic(PhysicalSwitch sw, OVXStatisticsReply msg) {
        this.log.info("virtualizeStatistic");

    }
}
