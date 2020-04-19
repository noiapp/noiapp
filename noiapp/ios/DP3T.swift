//
//  DP3T.swift
//  noiapp
//
//  Created by Lorenzo Angelini on 19/04/2020.
//

import Foundation
import PassKit
import LocalAuthentication
import DP3TSDK
@objc(DP3T)
class DP3T: RCTEventEmitter {
  
  var resolve : RCTPromiseResolveBlock
  var reject : RCTPromiseRejectBlock
  
  
  init(resolve: @escaping RCTPromiseResolveBlock, reject: @escaping RCTPromiseRejectBlock) {
    self.resolve  = resolve
    self.reject = reject
    
  }
  
  
  @objc func initDP3t(_ resolve: @escaping RCTPromiseResolveBlock,
                      rejecter reject: @escaping RCTPromiseRejectBlock){
    self.resolve = resolve
    self.reject = reject
    
    do {
      try DP3TTracing.initialize(with: Bundle.main.infoDictionary![kCFBundleNameKey as String] as! String, enviroment: .prod)
      resolve("DP3TT Initialized Correctly")
    }catch {
      reject("error_initializing", "Error Initializing DP3TT", error)
    }
  }
  
  
  @objc func startTracking(_ resolve: @escaping RCTPromiseResolveBlock,
                           rejecter reject: @escaping RCTPromiseRejectBlock){
    do {
      try DP3TTracing.startTracing()
      resolve("DP3TT Initialized Correctly")
    } catch {
      reject("error_starting", "Error starting dp3t", error)
      
    }
  }
  
  @objc func endtracking(){
    DP3TTracing.stopTracing()
  }
  
  override func supportedEvents() -> [String]! {
    return ["onDP3TResponse", "onChangeDP3TStatus"]
  }
  
}







