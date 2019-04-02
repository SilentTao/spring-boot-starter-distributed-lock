# spring-boot-starter-distributed-lock

![license](https://img.shields.io/github/license/alibaba/fescar.svg)

  目标:构建一个分布式锁的一站式解决方案，进行业务解耦，提供多种分布式锁的实现和不断优化和更新



#### 第一版将要整合的分布式锁实现

| 实现技术  | cap理论 | 适合场景               |
| --------- | ------- | ---------------------- |
| redis     | ap      |                        |
| zookeeper | ap      |                        |
| etcd      | cp      | 数据要求强一致性的场景 |


####  目录结构介绍

