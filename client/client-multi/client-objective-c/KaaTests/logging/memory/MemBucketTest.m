/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

#import <XCTest/XCTest.h>
#import <Foundation/Foundation.h>
#import "MemBucket.h"

@interface MemBucketTest : XCTestCase

@end

@implementation MemBucketTest

- (void)testAddLogRecord {
    [self addLogRecordTestHelperWithMaxSize:10 maxRecordCount:2];
    [self addLogRecordTestHelperWithMaxSize:14 maxRecordCount:10];
    [self addLogRecordTestHelperWithMaxSize:2 maxRecordCount:10];
    [self addLogRecordTestHelperWithMaxSize:10 maxRecordCount:1];
}

- (void)addLogRecordTestHelperWithMaxSize:(int32_t)maxSize maxRecordCount:(int32_t)maxRecordCount {
    MemBucket *bucket = [[MemBucket alloc] initWithId:1 maxSize:maxSize maxRecordCount:maxRecordCount];
    
    int32_t curSize = 0;
    int32_t curRecordCount = 0;
    
    LogRecord *record = [self getLogRecord];
    
    while ((curSize + [record getSize] <= maxSize) && (curRecordCount < maxRecordCount)) {
        XCTAssertTrue([bucket addRecord:record]);
        curRecordCount++;
        curSize += 3;
    }
    
    XCTAssertFalse([bucket addRecord:record]);
}

- (void)addRecordsCount:(NSInteger)recordCount toBucket:(MemBucket *)bucket {
    while (recordCount-- > 0) {
        [bucket addRecord:[self getLogRecord]];
    }
}

- (LogRecord *)getLogRecord {
    char _1byte = 0;
    int DATA_SIZE = 3;
    NSMutableData *data = [[NSMutableData alloc] initWithCapacity:DATA_SIZE];
    for (int i = 0; i < DATA_SIZE; i++) {
        [data appendBytes:&_1byte length:sizeof(char)];
    }
    
    LogRecord *record = [[LogRecord alloc]initWithData:data];
    return record;
}

@end
