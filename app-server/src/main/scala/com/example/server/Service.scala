package com.example.server

import com.example.lib.Foo

class Service {
  def process(foo: Foo) : Int = foo.baz
}
