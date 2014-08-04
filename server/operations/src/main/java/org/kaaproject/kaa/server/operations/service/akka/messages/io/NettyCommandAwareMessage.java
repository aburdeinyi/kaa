/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations.service.akka.messages.io;

import io.netty.channel.ChannelHandlerContext;

import org.apache.avro.specific.SpecificRecordBase;
import org.kaaproject.kaa.server.operations.service.http.commands.AbstractOperationsCommand;
import org.kaaproject.kaa.server.operations.service.http.commands.ChannelType;


/**
 * The Class NettyCommandAwareMessage.
 */
public abstract class NettyCommandAwareMessage extends NettyAwareMessage {

    /** The command. */
    protected final AbstractOperationsCommand<SpecificRecordBase, SpecificRecordBase> command;

    protected final ChannelType channelType;

    /**
     * Instantiates a new netty command aware message.
     *
     * @param handlerUuid the handler uuid
     * @param channelContext the channel context
     * @param command the command
     */
    public NettyCommandAwareMessage(String handlerUuid, ChannelHandlerContext channelContext,
            AbstractOperationsCommand<SpecificRecordBase, SpecificRecordBase> command, ChannelType channelType) {
        super(handlerUuid, channelContext);
        this.command = command;
        this.channelType = channelType;
    }

    /**
     * Gets the command.
     *
     * @return the command
     */
    public AbstractOperationsCommand<SpecificRecordBase, SpecificRecordBase> getCommand() {
        return command;
    }

    public ChannelType getChannelType() {
        return channelType;
    }
}