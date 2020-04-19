//
//  DP3T.swift
//  noiapp
//
//  Created by Lorenzo Angelini on 19/04/2020.
//

import Foundation
import PassKit
import LocalAuthentication
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
    

    }
      

   override func supportedEvents() -> [String]! {
      return ["onDP3TResponse", "onChangeDP3TStatus"]
    }
   
  }

  

  
  


