//
//  DP3TModule.m
//  noiapp
//
//  Created by Lorenzo Angelini on 19/04/2020.
//

#import <Foundation/Foundation.h>
#import "React/RCTBridgeModule.h"
#import "React/RCTEventEmitter.h"
#import <React/RCTConvert.h>

@interface RCT_EXTERN_MODULE(DP3T, RCTEventEmitter)

- (instancetype)init
{
  self = [super init];
  return self;
}

RCT_EXTERN_METHOD(initDP3t: (RCTPromiseResolveBlock)resolve
rejecter:(RCTPromiseRejectBlock)reject)


@end

