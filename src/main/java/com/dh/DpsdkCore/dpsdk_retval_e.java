package com.dh.DpsdkCore;

/** 错误码返回信息	
@param   DPSDK_RET_SYNC_FAIL = -1										<0 同步返回错误

@param   DPSDK_RET_SUCCESS = 0											成功
@param   DPSDK_RET_PSS_FAILED = 1										PSS失败默认值 待替换。																   
@param   DPSDK_RET_SERIALIZE_PDU_FAILED = 1								 协议解析失败
@param   DPSDK_RET_SENDDATA_FAILED = 2									 数据发送失败
@param   DPSDK_RET_NET_CONNECT_FAILED = 3								 连接远端失败
@param   DPSDK_RET_ALREADY_LOGIN = 4									 登录已存在
@param   DPSDK_RET_ALREADY_LOGOUT = 5									 已登出
@param   DPSDK_RET_SERIALIZE_XML_FAILED = 6								Xml解析失败
@param   DPSDK_RET_NODE_NO_RIGHT = 7									 无操作权限	
@param   DPSDK_RET_UNKNOW_DEVICE = 8									 未知设备
@param   DPSDK_RET_UNKNOW_CHANNEL = 9									 未知通道
@param   DPSDK_RET_DEVICE_OFFLINE = 10									 设备离线
@param   DPSDK_RET_RTSP_CONNECT_FAILED = 11								rtsp连接失败
@param   DPSDK_RET_RTP_LISTEN_FAILED = 12								rtp监听失败
@param   DPSDK_RET_RTP_CONNECT_FAILED = 13								rtp连接失败
@param   DPSDK_RET_PARSE_TRANSPORT_FAILED = 14							rtsp解析端口失败
@param   DPSDK_RET_ALREADY_CANCELED = 15								 命令已被取消
@param   DPSDK_RET_UNKNOWN_SESSION = 16									无效的session fixme:检查已有情况统一为此应答
				   
@param   DPSDK_RET_TALK_INNVALIDPARAM = 17								 对讲参数有误
@param   DPSDK_RET_TALK_NOT_SUPPORT = 18								 对讲不支持									   
@param   DPSDK_RET_DMSSESSION_NOT_FOUND = 19							 没找到对应的dmsSession
							   
@param   DPSDK_RET_ADSSESSION_NOT_FOUND = 20							 未找到ADS
@param   DPSDK_RET_ADSSESSION_NOT_LOGIN = 21							 未登录成功ADS
@param   DPSDK_RET_DATABASE_NO_RECORD = 22								 没有找到ALARM相关记录
@param   DPSDK_RET_ALARMTYPE_NOT_MATCH = 23								 报警类型不匹配
									   
@param   DPSDK_RET_PLAYBACK_SESSION_NOT_FOUND = 24						 无法找到回放会话
@param   DPSDK_RET_PLAYBACK_UNKNOW_PLAYTYPE = 25						 无法区分播放类型
@param   DPSDK_RET_PLAYBACK_NETSDK_SEEK_FAIL = 26						 网络SDK的seek命令失败
@param   DPSDK_RET_PLAYBACK_SEEK_SIZE_ERROR = 27						 回放定位的size错误
@param   DPSDK_RET_PLAYBACK_SEEK_TIME_ERROR = 28						 回放定位的时间错误
@param   DPSDK_RET_PLAYBACK_DEVICE_NOT_FOUND = 29						 回放时没有找到想要的设备
@param   DPSDK_RET_PLAYBACK_PLAY_REPEAT = 30							 该通道只允许回放一路
@param   DPSDK_RET_INVALID_CONFIGTYPE = 31								 该配置信息的类型不支持
@param   DPSDK_RET_UNSUPPORTED_STREAM = 32								 该码流类型不支持
@param   DPSDK_RET_PLAYBACK_NOTFIND_DEV = 33							 设备信息未找到
@param   DPSDK_RET_PLAYBACK_PARAM = 34									 回放参数错误
@param   DPSDK_RET_PLAYBACK_PARAM_CAMERA = 35							 回放未知摄像头
@param   DPSDK_RET_FTPSERVER_NOT_FIND = 36								FTP服务器没找到
@param   DPSDK_RET_FTPCURL_ERROR = 37									 调用curl返回错误
@param   DPSDK_RET_FTPCURL_LOCALFILE_NOT_OPEN = 38						 调用curl返回未找到本地文件
@param   DPSDK_RET_FTPCURL_LOCALFILE_NOT_READ = 39						 调用curl返回打开本地文件出错
@param   DPSDK_RET_FTPCURL_FTPFILE_ERROR = 40							 调用curl返回操作远程文件出错
@param   DPSDK_RET_FTPCURL_FREE_ERROR = 41								 调用curl返回释放出错
@param   DPSDK_RET_PCS_ERROR = 42                        				PCS发生错误
@param   DPSDK_RET_PES_ERROR = 43                        				PES发生错误
@param   DPSDK_RET_PES_NOT_LOGIN = 44									 未登陆到PES
@param   DPSDK_RET_PES_ENCODE_AHSOTCMD_FAILED = 45       				 报警主机命令组包失败
@param   DPSDK_RET_PES_ENCODE_DCTRL_FAILED = 46          				 门禁命令组包失败

@param   DPSDK_RET_CHANNEL_EMPTY = 48									 通道号为空
@param   DPSDK_RET_MSG_EMPTY = 49										 处理消息为空
@param   DPSDK_RET_MSG_INVALID_CMD = 50									未定义的消息操作
@param   DPSDK_RET_DECODE_PDU_FAILED = 51								 协议解析失败
@param   DPSDK_RET_SENDDATA_EMPTY = 52									 发送数据为空
@param   DPSDK_RET_PESSESSION_NOT_FOUND = 53							 没找到对应的pesSession
@param   DPSDK_RET_ALARMREPORT_NEW_FAILED = 54							 报警消息中内存申请失败
@param   DPSDK_RET_PCS_NOT_LOGIN = 55									 未登陆到PCS
@param   DPSDK_RET_RTSPMDL_NOT_FIND = 56								 没找到对应的RTSPMDL
@param   DPSDK_RET_RTSPMSG_INVALID_CMD = 57								未定义的RTSP消息操作
@param   DPSDK_RET_LOAD_XML = 58										 解析Xml失败

@param   DPSDK_RET_CONFIGEX_LOGIN_FAIL = 59								 设备登陆失败
@param   DPSDK_RET_CONFIGEX_LOGINOUT_FAIL = 60							 设备登出失败

@param   DPSDK_RET_NETSDK_ERROR = 61
@param   DPSDK_RET_DEVCONFIG_STRUCT_UNABLE_OPERATOR = 62				 该结构不支持该操作
@param   DPSDK_RET_LOCAL_INVALID_USERNAME = 63           				 无效的本地用户名
@param   DPSDK_RET_LOCAL_INVALID_PASSWORD = 64           				 无效的本地密码

@param   DPSDK_RET_CMS_RET_ERROR = 65									CMS 返回错误
@param   DPSDK_RET_DMS_RET_ERROR = 66									DMS 返回错误
@param   DPSDK_RET_PCS_RET_ERROR = 67									PCS 返回错误
@param   DPSDK_RET_RTSP_RET_ERROR = 68									RTSP 返回错误

@param   DPSDK_RET_CMS_ERR_NOT_FOUND = 69								CMS 返回错误 -- 未找到

@param   DPSDK_CORE_BEGIN  = 1000
@param   DPSDK_CORE_ERROR_NOT_SUPPORT = 1001							 不支持
@param   DPSDK_CORE_ERROR_GET_MEMORY_FAIL = 1002						 获取内存失败
@param   DPSDK_CORE_ERROR_WITHOUT_CREATE = 1003						 	没有创建
@param   DPSDK_CORE_ERROR_CREATE_FAIL = 1004							 创建失败
@param   DPSDK_CORE_ERROR_INIT_FAIL = 1005								 初始化失败
@param   DPSDK_CORE_ERROR_UINIT_FAIL = 1006								 反初始化失败
@param   DPSDK_CORE_ERROR_WITHOUT_INIT = 1007							 没有初始化
@param   DPSDK_CORE_ERROR_INVALID_HANDLE = 1008						 	无效的句柄
@param   DPSDK_CORE_ERROR_INVALID_PARAM = 1009							 无效的参数
@param   DPSDK_CORE_ERROR_TIMEOUT = 1010								 操作超时
@param   DPSDK_CORE_ERROR_SYNCFUN_ERROR = 1011							 同步调用错误
@param   DPSDK_CORE_ERROR_SERIES = 1012								 	串行化失败
@param   DPSDK_CORE_ERROR_FOUND_FAIL = 1013								 查找失败
@param   DPSDK_CORE_ERROR_SIZE_ZERO = 1014								 大小为零
@param   DPSDK_CORE_ERROR_PARSE_ALARM_ENABLE_FAIL = 1015				 解析报警布控失败
@param   DPSDK_CORE_ERROR_GET_FREEPORT_FAIL = 1016						 获取空闲Port失败
@param   DPSDK_CORE_ERROR_INVALID_SEQ = 1017               			 	无效的SEQ
@param   DPSDK_CORE_ERROR_WITHOUT_LOGIN = 1018             			 	没有登录
@param   DPSDK_CORE_ERROR_WITHOUT_LODEGROUP = 1019         			 	没有加组织信息
@param   DPSDK_CORE_ERROR_ERROR_LEN = 1020								 长度错误
@param   DPSDK_CORE_ERROR_RANGE_OVER = 1021							 	范围越界
@param   DPSDK_CORE_ERROR_CAPTURE_FAIL = 1022							 抓图失败
@param   DPSDK_CORE_ERROR_OPEN_FILE_FAIL = 1023						 	打开文件失败
@param   DPSDK_CORE_ERROR_SAVE_FILE_FAIL = 1024						 	保存文件失败
@param   DPSDK_CORE_ERROR_STARTRECORD_FAIL = 1025						 录制实时视频失败
@param   DPSDK_CORE_ERROR_STOPRECORD_FAIL = 1026						 停止录制视频失败
@param   DPSDK_CORE_ERROR_SETOSDTXT_FAIL = 1027						 	设置osd信息失败   
@param   DPSDK_CORE_ERROR_CLEANUP_OSDTXT_FAIL = 1028       			 	清除osd信息失败
@param   DPSDK_CORE_ERROR_OPENWINDOW_FAIL = 1029						 开窗失败(目前暂定最大开4窗)
@param   DPSDK_CORE_END = 2000

@param   DPSDK_RET_END = 5000

@param   SERVER_RET_CMS_ERR_BEGIN = 1000000							 	CMS返回开始，不做返回值判断
@param   SERVER_RET_CMS_ERR_QUERY_PU_SUCCESS = 1000001					 查询全部录像时只有前端查询成功
@param   SERVER_RET_CMS_ERR_QUERY_CENTER_SUCCESS = 1000002				 查询全部录像时只有中心查询成功

@param   SERVER_RET_CMS_CLIENT_ERROR_BEGIN = 1000420					CMS客户端协议返回开始，不做返回值判断
@param   SERVER_RET_CMS_ERR_NO_USER_ID = 1000421						 用户ID不存在
@param   SERVER_RET_CMS_ERR_NO_USER_NAME_TO_ID = 1000422				 该用户名匹配不到ID
@param   SERVER_RET_CMS_ERR_NO_USER_NAME = 1000423						 用户名不存在
@param   SERVER_RET_CMS_ERR_PASSWORD_INVALID = 1000424					 密码无效
@param   SERVER_RET_CMS_ERR_INVALID_USER_ID = 1000425					 无效的用户ID
@param   SERVER_RET_CMS_ERR_USER_LOCKED = 1000426						 用户被锁定
@param   SERVER_RET_CMS_ERR_SESSION_EXIST = 1000427						用户已经存在登录会话
@param   SERVER_RET_CMS_ERR_NO_SESSION = 1000428						 会话不存在
@param   SERVER_RET_CMS_ERR_SERVER_REGISTERED = 1000429					 服务已经注册
@param   SERVER_RET_CMS_ERR_SERVER_NOT_REGISTER = 1000430				 功能服务没有注册
@param   SERVER_RET_CMS_ERR_INVALID_CAMERA_ID = 1000431				 	摄像头id无效
@param   SERVER_RET_CMS_ERR_NO_DEVICE = 1000432						 	找不到设备
@param   SERVER_RET_CMS_ERR_MEDIA_SESSION_EXIST = 1000433				 媒体会话已存在
@param   SERVER_RET_CMS_ERR_GRANT_SESSION_EXIST = 1000434				 授权会话已存在
@param   SERVER_RET_CMS_ERR_NO_CAMERA_ROW = 1000435						 找不到摄像头表
@param   SERVER_RET_CMS_ERR_UNKNOWN_TYPE = 1000436						 无效的类型值
@param   SERVER_RET_CMS_ERR_TOO_MANY_GROUP_COUNT = 1000437				 用户从属的组太多
@param   SERVER_RET_CMS_ERR_TOO_MANY = 1000438							 数量太多
@param   SERVER_RET_CMS_ERR_EXIST_HIGH_USER = 1000439					 存在高级别用户 
@param   SERVER_RET_CMS_CLIENT_ERROR_END = 1000520

@param   SERVER_RET_CMS_SERVER_ERROR_BEGIN = 1000520					CMS服务协议返回开始，不做返回值判断
@param   SERVER_RET_CMS_ERR_NO_CONNECTION = 1000521						 连接不存在
@param   SERVER_RET_CMS_ERR_INVALID_SERVER = 1000522					 未在系统中登记的服务
@param   SERVER_RET_CMS_ERR_NO_DOMAIN = 1000523							 服务域不存在
@param   SERVER_RET_CMS_ERR_NO_SERVER_BEAN = 1000524					 服务对象不存在
@param   SERVER_RET_CMS_ERR_NO_MTS_TO_USE = 1000525						 没有MTS可用
@param   SERVER_RET_CMS_ERR_SESSION_DELETE = 1000526					 会话已经拆除
@param   SERVER_RET_CMS_ERR_SERVER_RECONNECT = 1000527					 功能服务正在重连
@param   SERVER_RET_CMS_ERR_ADD_CAMERA_FAILED = 1000528					 添加摄像头失败
@param   SERVER_RET_CMS_ERR_ADD_CLIENT_FAILED = 1000529					 添加客户端失败
@param   SERVER_RET_CMS_ERR_DATABASE_ACCESS_FAILED = 1000530			 数据库访问失败
@param   SERVER_RET_CMS_ERR_DATABASE_NO_RECORD = 1000531				 数据库没有记录
@param   SERVER_RET_CMS_ERR_DATA_TOO_LONG = 1000532						 数据太长了
@param   SERVER_RET_CMS_ERR_NO_GROUPS_OF_USER = 1000533				 	没有找到用户所从属的组
@param   SERVER_RET_CMS_ERR_QUERY_RECORD_FAILED = 1000534				 查询录像失败
@param   SERVER_RET_CMS_ERR_OTHER_USER_PLAYBACK = 1000535				 其他用户在回放该摄像头
@param   SERVER_RET_CMS_ERR_REACH_PU_PLAYBACK_LIMIT = 1000536			 达到前端回放地限制
@param   SERVER_RET_CMS_ERR_NO_DMS_TO_USE = 1000537					 	没有DMS可用
@param   SERVER_RET_CMS_ERR_DEV_GRANT_CHANGED = 1000538				 	设备授权更改到其他服务
@param   SERVER_RET_CMS_ERR_ADD_DVR_FAILED = 1000539					 添加DVR失败
@param   SERVER_RET_CMS_ERR_GRANT_FAILED = 1000540						 授权到DMS失败
@param   SERVER_RET_CMS_ERR_SS_PLAYBACK_FAILED = 1000541				SS回放失败
@param   SERVER_RET_CMS_ERR_REACH_SYSTEM_LIMIT = 1000542				 达到系统上限
@param   SERVER_RET_CMS_ERR_INVALID_DEVICE_PROVIDER = 1000543			 无效的设备厂家
@param   SERVER_RET_CMS_ERR_NO_URL = 1000544							 没有升级URL
@param   SERVER_RET_CMS_ERR_NO_SS_TO_USE = 1000545						 没有SS可用
@param   SERVER_RET_CMS_ERR_PU_QUERY_TIMEOUT = 1000546					 前端查询超时
@param   SERVER_RET_CMS_ERR_PU_QUERY_RECORD_FAILED = 1000547			 前端查询录像失败
@param   SERVER_RET_CMS_ERR_NO_MTS_FOR_DEVICE = 1000548					没有和这个设备管理的MTS
@param   SERVER_RET_CMS_ERR_DEVICE_IN_TALKING = 1000549					设备正在进行语音对讲
@param   SERVER_RET_CMS_ERR_DEVICE_NOT_TALKING = 1000550				 设备没有在进行语音对讲
@param   SERVER_RET_CMS_ERR_ENCODE_PDU = 1000551						CMS在准备应答时候，进行Encode操作失败
@param   SERVER_RET_CMS_ERR_DECODE_PDU = 1000552						CMS在准备应答时候，进行Decode操作失败
@param   SERVER_RET_CMS_ERR_NOT_FOUND_LOWER_DOMAIN = 1000553			 没有找到下级域
@param   SERVER_RET_CMS_ERR_NOT_LOGIN_LOWER_DOMAIN = 1000554			 未登陆下级域
@param   SERVER_RET_CMS_ERR_NO_RIGHT = 1000555							 无权限
@param   SERVER_RET_CMS_ERR_QUERY_ALARM_FAILED = 1000556				 查询报警失败
@param   SERVER_RET_CMS_ERR_DEIVCE_OFFLINE = 1000557					 设备不在线
@param   SERVER_RET_CMS_ERR_LOWER_DOMAIN_EXCEPTION = 1000558			 下级域异常
@param   SERVER_RET_CMS_ERR_ALARM_PRE_RECORD_OPENED = 1000559			 报警预录已经打开
@param   SERVER_RET_CMS_ERR_RECONNECT_DEVICE = 1000560					 功能服务正在重连设备
@param   SERVER_RET_CMS_ERR_SEND_FUN_SVR_REQ_FAIL = 1000561				向功能服务器发送请求失败

@param   SERVER_RET_CMS_ERR_CU_START_RECORD_FAIL = 1000562				 开始录像失败
@param   SERVER_RET_CMS_ERR_CU_RECORING_NOW = 1000563					 正在录像
@param   SERVER_RET_CMS_ERR_CU_STOP_RECORD_FAIL = 1000564				 停止录像失败
@param   SERVER_RET_CMS_ERR_CU_OTHERUSER_RECORDING = 1000565			 其他用户正在录像
@param   SERVER_RET_CMS_ERR_CU_START_RECORD_RUNNING = 1000566			 开始录像失败，运行中
@param   SERVER_RET_CMS_ERR_CU_START_RECORD_LIMITE = 1000567			 开始录像失败，被禁止
@param   SERVER_RET_CMS_ERR_CU_START_RECORD_NO_SS = 1000568				 开始录像失败，没有可用的SS
@param   SERVER_RET_CMS_ERR_NO_PES_TO_USE = 1000569						没有可用的PES服务器 
																 
@param   SERVER_RET_CMS_ERR_UNKNOWN_PROTOCOL = 1000570					 不支持的协议类型
@param   SERVER_RET_CMS_ERR_CONFIG_FILE_TIMEOUT = 1000571				 组配置文件过期
@param   SERVER_RET_CMS_ERR_NO_BOLCK  = 1000572							无可用的block
@param   SERVER_RET_CMS_ERR_END = 1001000								CMS返回结束


@param   SERVER_RET_DMS_ERR_BEGIN = 1001000					   			DMS返回开始，不做返回值判断
@param   SERVER_RET_DMS_ERR_HAS_NO_RIGHT = 1001401						没有权限
@param   SERVER_RET_DMS_CLIENT_ERROR_BEGIN = 1001420					DMS客户端协议返回开始，不做返回值判断
@param   SERVER_RET_DMS_ERR_NO_PRIVILEGE = 1001421						 没有权限
@param   SERVER_RET_DMS_CLIENT_ERROR_END = 1001520

@param   SERVER_RET_DMS_SERVER_ERROR_BEGIN = 1001520					DMS服务协议返回开始，不做返回值判断
@param   SERVER_RET_DMS_ERR_PTZ_FAILED = 1001521						云台内部控制出错
@param   SERVER_RET_DMS_ERR_CONFIG_SET_FAILED = 1001522				 	设备配置内部控制出错
@param   SERVER_RET_DMS_ERR_CONFIG_GET_FAILED = 1001523				 	设备配置内部控制出错
@param   SERVER_RET_DMS_ERR_CAMERA_OCCUPY = 1001524					 	摄像头被其他用户锁定
@param   SERVER_RET_DMS_ERR_PTZ_ACCESS_FAILED = 1001525				 	象云台协商管理模块请求访问失败
@param   SERVER_RET_DMS_ERR_TCP_COMM_NO_CLIENT = 1001526				 用户连接没有绑定到授权的客户端
@param   SERVER_RET_DMS_ERR_CLIENT_UNIT_NOT_FOUND = 1001527			 	没有找到没有添加过的客户端
@param   SERVER_RET_DMS_ERR_DEVICE_NOT_FOUND = 1001528					 设备没找到
@param   SERVER_RET_DMS_ERR_PRIVILEGE_NOT_FOUND = 1001529				 没有找到授权信息
@param   SERVER_RET_DMS_ERR_UNKNOWN_COMMAND = 1001530					 未知命令
@param   SERVER_RET_DMS_ERR_OCCUPY_BY_HIGHER_USER = 1001531			 	被高级用户占用
@param   SERVER_RET_DMS_ERR_NORMAL_LOCK_FAILED = 1001532				 需要Server检查的Lock失败错误
@param   SERVER_RET_DMS_ERR_OCCUPY_BY_OTHER_USER = 1001533				 被其他用户占用
@param   SERVER_RET_DMS_ERR_NORMAL_UNLOCK_FAILED = 1001534				 需要Server检查的UnLock失败错误
@param   SERVER_RET_DMS_ERR_NO_DEVICE = 1001535						 	没有设备
@param   SERVER_RET_DMS_ERR_NO_RIGHT  = 1001536						 	没有权限
@param   SERVER_RET_DMS_ERR_NOT_FOUND_LOWER_DOMAIN = 1001537			 没有找到下级域
@param   SERVER_RET_DMS_ERR_NOT_LOGIN_LOWER_DOMAIN = 1001538			 没有登录下级域
@param   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_ID = 1001539				 查询视频诊断ID失败
@param   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_TYPE_COUNT = 1001540		 查询视频诊断类型数目失败
@param   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_INFO = 1001541				 查询视频诊断信息失败
@param   SERVER_RET_DMS_ERR_STOP_QUERY_DIAGNOSIS_INFO = 1001542		 	停止视频诊断信息查询失败
@param   SERVER_RET_DMS_ERR_START_QUERY_PERSON_COUNT = 1001543			 开始查询人数统计信息失败
@param   SERVER_RET_DMS_ERR_QUERY_PERSON_COUNT = 1001544				 查询人数统计信息失败
@param   SERVER_RET_DMS_ERR_STOP_QUERY_PERSON_COUNT = 1001545			 停止人数统计信息查询失败
@param   SERVER_RET_DMS_ERR_END = 1002000						    	DMS返回结束

@param   SERVER_RET_VMS_ERR_BEGIN = 1002000                
@param   SERVER_RET_VMS_SERVER_ERROR_BEGIN = 1002520					VMS服务协议返回开始，不做返回值判断
@param   SERVER_RET_VMS_ERR_FAILED = 1002520							失败-其他原因
@param   SERVER_RET_VMS_ERR_ID_ALREADY_EXIST = 1002521					NVD ID已存在
@param   SERVER_RET_VMS_ERR_INVALID_ID = 1002522						无效的ID
@param   SERVER_RET_VMS_ERR_REACH_LIMIT = 1002523						 达到上限
@param   SERVER_RET_VMS_ERR_END = 1003000						    	VMS返回结束


@param   SERVER_RET_RTSP_ERR_BEGIN = 1003000  
@param   SERVER_RET_RTSP_ERR_SETUP_FAILED = 1003503					 	Rtsp建立失败
@param   SERVER_RET_RTSP_SERVER_ERROR_BEGIN  = 1003520					
@param   SERVER_RET_RTSP_ERR_RECONNECT_DEVICE  = 1003521				正在重连设备
@param   SERVER_RET_RTSP_ERR_END = 1004000						    	RTSP返回结束

@param   SERVER_RET_ALARM_ERR_BEGIN = 1004720                
@param   SERVER_RET_ALARM_ERR_URL = 1004721							 	无效的URL
@param   SERVER_RET_ALARM_ERR_RES = 1004722							 	无效的数据
@param   SERVER_RET_ALARM_ERR_MDL_TYPE = 1004723						无效的单元类型
@param   SERVER_RET_ALARM_ERR_SCHEME_INDEX = 1004724					无效的预案索引
@param   SERVER_RET_ALARM_ERR_SCHEME_TYPE = 1004725					 	无效的预案类型
@param   SERVER_RET_ALARM_ERR_SCHEME_STRING = 1004726					预案字符串解析失败
@param   SERVER_RET_ALARM_ERR_ALARM_NODE = 1004727						无效的报警节点
@param   SERVER_RET_ALARM_ERR_END = 1004820					    	 	报警返回结束


@param   SERVER_RET_MS_ERR_BEGIN = 1005000                
@param   SERVER_RET_MS_CLIENT_ERROR_BEGIN = 1005420
@param   SERVER_RET_MS_ERR_ALREADY_LOGIN = 1005421						已经登录
@param   SERVER_RET_MS_ERR_INVALID_SESSION_ID = 1005422					无效的会话ID
@param   SERVER_RET_MS_ERR_NOT_LOGIN = 1005423							未登录
@param   SERVER_RET_MS_ERR_INVALID_CONNECTION = 1005424					无效连接
@param   SERVER_RET_MS_ERR_INVALID_DEV_TYPE = 1005425					无效的设备类型
@param   SERVER_RET_MS_ERR_INVALID_CAMERA_ID = 1005426					无效的摄像头id
@param   SERVER_RET_MS_ERR_CAMERA_SESSION_EXIST = 1005427				摄像头已经添加过
@param   SERVER_RET_MS_ERR_NO_CAMERA_SESSION = 1005428					摄像头会话不存在
@param   SERVER_RET_MS_ERR_FIND_SAME_TOKEN = 1005429					找到相同的token
@param   SERVER_RET_MS_ERR_UNKNOWN_RECORD_TYPE = 1005430				无法识别的录像类型
@param   SERVER_RET_MS_ERR_INVALID_FILE_NAME = 1005431					无效的录像文件名称
@param   SERVER_RET_MS_ERR_INVALID_TIME_VALUE = 1005432				 	无效的录像时间值
@param   SERVER_RET_MS_ERR_NOT_FOUND_SESSION = 1005433					没有找到会话
@param   SERVER_RET_MS_ERR_INVALID_RTSP_URL = 1005434					无效的RTSP URL
@param   SERVER_RET_MS_ERR_PLAN_EXIST = 1005435						 	计划已经存在
@param   SERVER_RET_MS_CLIENT_ERROR_END = 1005520

@param   SERVER_RET_MS_SERVER_ERROR_BEGIN = 1005520
@param   SERVER_RET_MS_ERR_DEV_NOT_LOGIN = 1005521						设备还未登录
@param   SERVER_RET_MS_ERR_SDK_OPERATE_FAILED = 1005522				 	sdk调用失败
@param   SERVER_RET_MS_ERR_SESSION_USE_OUT = 1005523					会话用完
@param   SERVER_RET_MS_ERR_RTSP_CONNECT_FAILED = 1005524				rtsp连接失败
@param   SERVER_RET_MS_ERR_RTP_LISTEN_FAILED = 1005525					RTP侦听失败
@param   SERVER_RET_MS_ERR_RTSP_SETUP_FAILED = 1005526					RTSP Setup操作失败
@param   SERVER_RET_MS_ERR_RTSP_PLAY_FAILED = 1005527					RTSP PLAY操作失败
@param   SERVER_RET_MS_ERR_ADD_RTP_SESSION_FAILED = 1005528				 添加RTP SESSION到serverbase失败
@param   SERVER_RET_MS_ERR_DISK_SPACE_NOT_ENOUGH = 1005529				磁盘空间不足
@param   SERVER_RET_MS_ERR_OPEN_FILE_FAILED = 1005530					文件打开失败
@param   SERVER_RET_MS_ERR_NOT_FOUND_RTSP_CLIENT = 1005531				找不到RTSP客户端连接
@param   SERVER_RET_MS_ERR_RTSP_DISCONNECTED = 1005532					RTSP连接断开
@param   SERVER_RET_MS_ERR_RECORD_QUERY_TIMEOUT = 1005533				录像查询超时
@param   SERVER_RET_MS_ERR_SDK_CALLBACK_INVALID_DATA = 1005534			sdk 返回数据不正确
@param   SERVER_RET_MS_ERR_SNAP_STORE_PATH_INVALID = 1005535			设置的SS端SNAP存储路径有问题
@param   SERVER_RET_MS_ERR_SNAP_STORE_FILE_FAILED = 1005536			 	SS在存储文件时候操作失败
@param   SERVER_RET_MS_ERR_SNAP_ENCODE_FAILED = 1005537				 	SS在编码回复pdu时候失败
@param   SERVER_RET_MS_ERR_IFRAME_2_BMP = 1005538						SS在转换I帧到BMP时候失败
@param   SERVER_RET_MS_ERR_DUPLICATE_PLAN_FOUND = 1005539				重复的PlanId发现
@param   SERVER_RET_MS_ERR_SDK_CALLBACK_TIMEOUT = 1005540				SDK调用Callback超时，没有返回数据																						   
@param   SERVER_RET_MS_ERR_NOT_FOUND_SESSION_ID = 1005541				未找到camera_session_id
@param   SERVER_RET_MS_ERR_INVALID_STREAM_TYPE = 1005542				非法的码流类型
@param   SERVER_RET_MS_ERR_ADD_LIVECHANNEL_FAILED = 1005543			 	添加直播频道失败
@param   SERVER_RET_MS_ERR_GET_TALKDECODE_FAILED = 1005544				获取对讲格式失败
@param   SERVER_RET_MS_ERR_LOGIN_DEV_FAILED = 1005545					登陆语音设备失败
@param   SERVER_RET_MS_ERR_NOT_MATCH_AUDIO_TYPE = 1005546				音频格式不匹配
@param   SERVER_RET_MS_ERR_NOT_FOUND_DISK = 1005547						未找到磁盘
@param   SERVER_RET_MS_ERR_NOT_FOUND_RECORD_PLAN = 1005548				未找到录像计划
@param   SERVER_RET_MS_SERVER_ERROR_END = 1005620
@param   SERVER_RET_MS_ERR_END = 1006000								MS返回结束

@param   SERVER_RET_PCS_ERR_BEGIN = 1006000								PCS服务协议返回开始，不做返回值判断
@param   SERVER_RET_PCS_ERR_NOT_FOUND = 1006404							级联设备未下发
@param   SERVER_RET_PCS_ERR_NOT_ACCEPTABLE = 1006406					级联订阅，本级PTS监听失败
@param   SERVER_RET_PCS_ERR_DEVICE_OFFLINE = 1006710					设备断线
@param   SERVER_RET_PCS_ERR_DOMIAN_OFFLINE = 1006713					下级域不在线
@param   SERVER_RET_PCS_ERR_PTS_CANNOT_PING = 1006714					上级连接下级PTS失败
@param   SERVER_RET_PCS_ERR_NO_ACK = 1006715							无应答
@param   SERVER_RET_PCS_ERR_END = 1007000								PCS返回结束	
*/

public class dpsdk_retval_e 
{		
	public static final int   DPSDK_RET_SYNC_FAIL = -1;										//<0 同步返回错误

	public static final int   DPSDK_RET_SUCCESS = 0;											//成功
	public static final int   DPSDK_RET_PSS_FAILED = 1;										// PSS失败默认值 待替换。																   
	public static final int   DPSDK_RET_SERIALIZE_PDU_FAILED = 1;							// 协议解析失败
	public static final int   DPSDK_RET_SENDDATA_FAILED = 2;									// 数据发送失败
	public static final int   DPSDK_RET_NET_CONNECT_FAILED = 3;								// 连接远端失败
	public static final int   DPSDK_RET_ALREADY_LOGIN = 4;									// 登录已存在
	public static final int   DPSDK_RET_ALREADY_LOGOUT = 5;									// 已登出
	public static final int   DPSDK_RET_SERIALIZE_XML_FAILED = 6;							// Xml解析失败
	public static final int   DPSDK_RET_NODE_NO_RIGHT = 7;									// 无操作权限	
	public static final int   DPSDK_RET_UNKNOW_DEVICE = 8;									// 未知设备
	public static final int   DPSDK_RET_UNKNOW_CHANNEL = 9;									// 未知通道
	public static final int   DPSDK_RET_DEVICE_OFFLINE = 10;									// 设备离线
	public static final int   DPSDK_RET_RTSP_CONNECT_FAILED = 11;							// rtsp连接失败
	public static final int   DPSDK_RET_RTP_LISTEN_FAILED = 12;								// rtp监听失败
	public static final int   DPSDK_RET_RTP_CONNECT_FAILED = 13;								// rtp连接失败
	public static final int   DPSDK_RET_PARSE_TRANSPORT_FAILED = 14;							// rtsp解析端口失败
	public static final int   DPSDK_RET_ALREADY_CANCELED = 15;								// 命令已被取消
	public static final int   DPSDK_RET_UNKNOWN_SESSION = 16;								// 无效的session fixme:检查已有情况统一为此应答
					   
	public static final int   DPSDK_RET_TALK_INNVALIDPARAM = 17;								// 对讲参数有误
	public static final int   DPSDK_RET_TALK_NOT_SUPPORT = 18;								// 对讲不支持									   
	public static final int   DPSDK_RET_DMSSESSION_NOT_FOUND = 19;							// 没找到对应的dmsSession
								   
	public static final int   DPSDK_RET_ADSSESSION_NOT_FOUND = 20;							// 未找到ADS
	public static final int   DPSDK_RET_ADSSESSION_NOT_LOGIN = 21;							// 未登录成功ADS
	public static final int   DPSDK_RET_DATABASE_NO_RECORD = 22;								// 没有找到ALARM相关记录
	public static final int   DPSDK_RET_ALARMTYPE_NOT_MATCH = 23;							// 报警类型不匹配
										   
	public static final int   DPSDK_RET_PLAYBACK_SESSION_NOT_FOUND = 24;						// 无法找到回放会话
	public static final int   DPSDK_RET_PLAYBACK_UNKNOW_PLAYTYPE = 25;						// 无法区分播放类型
	public static final int   DPSDK_RET_PLAYBACK_NETSDK_SEEK_FAIL = 26;						// 网络SDK的seek命令失败
	public static final int   DPSDK_RET_PLAYBACK_SEEK_SIZE_ERROR = 27;						// 回放定位的size错误
	public static final int   DPSDK_RET_PLAYBACK_SEEK_TIME_ERROR = 28;						// 回放定位的时间错误
	public static final int   DPSDK_RET_PLAYBACK_DEVICE_NOT_FOUND = 29;						// 回放时没有找到想要的设备
	public static final int   DPSDK_RET_PLAYBACK_PLAY_REPEAT = 30;							// 该通道只允许回放一路
	public static final int   DPSDK_RET_INVALID_CONFIGTYPE = 31;								// 该配置信息的类型不支持
	public static final int   DPSDK_RET_UNSUPPORTED_STREAM = 32;								// 该码流类型不支持
	public static final int   DPSDK_RET_PLAYBACK_NOTFIND_DEV = 33;							// 设备信息未找到
	public static final int   DPSDK_RET_PLAYBACK_PARAM = 34;									// 回放参数错误
	public static final int   DPSDK_RET_PLAYBACK_PARAM_CAMERA = 35;							// 回放未知摄像头
	public static final int   DPSDK_RET_FTPSERVER_NOT_FIND = 36;								// FTP服务器没找到
	public static final int   DPSDK_RET_FTPCURL_ERROR = 37;									// 调用curl返回错误
	public static final int   DPSDK_RET_FTPCURL_LOCALFILE_NOT_OPEN = 38;						// 调用curl返回未找到本地文件
	public static final int   DPSDK_RET_FTPCURL_LOCALFILE_NOT_READ = 39;						// 调用curl返回打开本地文件出错
	public static final int   DPSDK_RET_FTPCURL_FTPFILE_ERROR = 40;							// 调用curl返回操作远程文件出错
	public static final int   DPSDK_RET_FTPCURL_FREE_ERROR = 41;								// 调用curl返回释放出错
	public static final int   DPSDK_RET_PCS_ERROR = 42;                        				// PCS发生错误
	public static final int   DPSDK_RET_PES_ERROR = 43;                        				// PES发生错误
	public static final int   DPSDK_RET_PES_NOT_LOGIN = 44;									// 未登陆到PES
	public static final int   DPSDK_RET_PES_ENCODE_AHSOTCMD_FAILED = 45;       				// 报警主机命令组包失败
	public static final int   DPSDK_RET_PES_ENCODE_DCTRL_FAILED = 46;          				// 门禁命令组包失败

	public static final int   DPSDK_RET_CHANNEL_EMPTY = 48;									// 通道号为空
	public static final int   DPSDK_RET_MSG_EMPTY = 49;										// 处理消息为空
	public static final int   DPSDK_RET_MSG_INVALID_CMD = 50;								// 未定义的消息操作
	public static final int   DPSDK_RET_DECODE_PDU_FAILED = 51;								// 协议解析失败
	public static final int   DPSDK_RET_SENDDATA_EMPTY = 52;									// 发送数据为空
	public static final int   DPSDK_RET_PESSESSION_NOT_FOUND = 53;							// 没找到对应的pesSession
	public static final int   DPSDK_RET_ALARMREPORT_NEW_FAILED = 54;							// 报警消息中内存申请失败
	public static final int   DPSDK_RET_PCS_NOT_LOGIN = 55;									// 未登陆到PCS
	public static final int   DPSDK_RET_RTSPMDL_NOT_FIND = 56;								// 没找到对应的RTSPMDL
	public static final int   DPSDK_RET_RTSPMSG_INVALID_CMD = 57;							// 未定义的RTSP消息操作
	public static final int   DPSDK_RET_LOAD_XML = 58;										// 解析Xml失败

	//配置模块ex
	public static final int   DPSDK_RET_CONFIGEX_LOGIN_FAIL = 59;							// 设备登陆失败
	public static final int   DPSDK_RET_CONFIGEX_LOGINOUT_FAIL = 60;							// 设备登出失败

	//返回netsdk的错误
	public static final int   DPSDK_RET_NETSDK_ERROR = 61;
	public static final int   DPSDK_RET_DEVCONFIG_STRUCT_UNABLE_OPERATOR = 62;				// 该结构不支持该操作
	public static final int   DPSDK_RET_LOCAL_INVALID_USERNAME = 63;           				// 无效的本地用户名
	public static final int   DPSDK_RET_LOCAL_INVALID_PASSWORD = 64;           				// 无效的本地密码

	//服务返回错误未定义
	public static final int   DPSDK_RET_CMS_RET_ERROR = 65;									// CMS 返回错误
	public static final int   DPSDK_RET_DMS_RET_ERROR = 66;									// DMS 返回错误
	public static final int   DPSDK_RET_PCS_RET_ERROR = 67;									// PCS 返回错误
	public static final int   DPSDK_RET_RTSP_RET_ERROR = 68;									// RTSP 返回错误

	public static final int   DPSDK_RET_CMS_ERR_NOT_FOUND = 69;								// CMS 返回错误 -- 未找到
	
	public static final int   DPSDK_CORE_BEGIN  = 1000;
	public static final int   DPSDK_CORE_ERROR_NOT_SUPPORT = 1001;							// 不支持
	public static final int   DPSDK_CORE_ERROR_GET_MEMORY_FAIL = 1002;						// 获取内存失败
	public static final int   DPSDK_CORE_ERROR_WITHOUT_CREATE = 1003;						// 没有创建
	public static final int   DPSDK_CORE_ERROR_CREATE_FAIL = 1004;							// 创建失败
	public static final int   DPSDK_CORE_ERROR_INIT_FAIL = 1005;								// 初始化失败
	public static final int   DPSDK_CORE_ERROR_UINIT_FAIL = 1006;							// 反初始化失败
	public static final int   DPSDK_CORE_ERROR_WITHOUT_INIT = 1007;							// 没有初始化
	public static final int   DPSDK_CORE_ERROR_INVALID_HANDLE = 1008;						// 无效的句柄
	public static final int   DPSDK_CORE_ERROR_INVALID_PARAM = 1009;							// 无效的参数
	public static final int   DPSDK_CORE_ERROR_TIMEOUT = 1010;								// 操作超时
	public static final int   DPSDK_CORE_ERROR_SYNCFUN_ERROR = 1011;							// 同步调用错误
	public static final int   DPSDK_CORE_ERROR_SERIES = 1012;								// 串行化失败
	public static final int   DPSDK_CORE_ERROR_FOUND_FAIL = 1013;							// 查找失败
	public static final int   DPSDK_CORE_ERROR_SIZE_ZERO = 1014;								// 大小为零
	public static final int   DPSDK_CORE_ERROR_PARSE_ALARM_ENABLE_FAIL = 1015;				// 解析报警布控失败
	public static final int   DPSDK_CORE_ERROR_GET_FREEPORT_FAIL = 1016;						// 获取空闲Port失败
	public static final int   DPSDK_CORE_ERROR_INVALID_SEQ = 1017;               			// 无效的SEQ
	public static final int   DPSDK_CORE_ERROR_WITHOUT_LOGIN = 1018;             			// 没有登录
	public static final int   DPSDK_CORE_ERROR_WITHOUT_LODEGROUP = 1019;         			// 没有加组织信息
	public static final int   DPSDK_CORE_ERROR_ERROR_LEN = 1020;								// 长度错误
	public static final int   DPSDK_CORE_ERROR_RANGE_OVER = 1021;							// 范围越界
	public static final int   DPSDK_CORE_ERROR_CAPTURE_FAIL = 1022;							// 抓图失败
	public static final int   DPSDK_CORE_ERROR_OPEN_FILE_FAIL = 1023;						// 打开文件失败
	public static final int   DPSDK_CORE_ERROR_SAVE_FILE_FAIL = 1024;						// 保存文件失败
	public static final int   DPSDK_CORE_ERROR_STARTRECORD_FAIL = 1025;						// 录制实时视频失败
	public static final int   DPSDK_CORE_ERROR_STOPRECORD_FAIL = 1026;						// 停止录制视频失败
	public static final int   DPSDK_CORE_ERROR_SETOSDTXT_FAIL = 1027;						// 设置osd信息失败   
	public static final int   DPSDK_CORE_ERROR_CLEANUP_OSDTXT_FAIL = 1028;       			// 清除osd信息失败
	public static final int   DPSDK_CORE_ERROR_OPENWINDOW_FAIL = 1029;						// 开窗失败(目前暂定最大开4窗)
	public static final int   DPSDK_CORE_END = 2000;

	public static final int   DPSDK_RET_END = 5000;

	public static final int   SERVER_RET_CMS_ERR_BEGIN = 1000000;							// CMS返回开始，不做返回值判断
	public static final int   SERVER_RET_CMS_ERR_QUERY_PU_SUCCESS = 1000001;					// 查询全部录像时;只有前端查询成功
	public static final int   SERVER_RET_CMS_ERR_QUERY_CENTER_SUCCESS = 1000002;				// 查询全部录像时;只有中心查询成功

	public static final int   SERVER_RET_CMS_CLIENT_ERROR_BEGIN = 1000420;					// CMS客户端协议返回开始，不做返回值判断
	public static final int   SERVER_RET_CMS_ERR_NO_USER_ID = 1000421;						// 用户ID不存在
	public static final int   SERVER_RET_CMS_ERR_NO_USER_NAME_TO_ID = 1000422;				// 该用户名匹配不到ID
	public static final int   SERVER_RET_CMS_ERR_NO_USER_NAME = 1000423;						// 用户名不存在
	public static final int   SERVER_RET_CMS_ERR_PASSWORD_INVALID = 1000424;					// 密码无效
	public static final int   SERVER_RET_CMS_ERR_INVALID_USER_ID = 1000425;					// 无效的用户ID
	public static final int   SERVER_RET_CMS_ERR_USER_LOCKED = 1000426;						// 用户被锁定
	public static final int   SERVER_RET_CMS_ERR_SESSION_EXIST = 1000427;					// 用户已经存在登录会话
	public static final int   SERVER_RET_CMS_ERR_NO_SESSION = 1000428;						// 会话不存在
	public static final int   SERVER_RET_CMS_ERR_SERVER_REGISTERED = 1000429;				// 服务已经注册
	public static final int   SERVER_RET_CMS_ERR_SERVER_NOT_REGISTER = 1000430;				// 功能服务没有注册
	public static final int   SERVER_RET_CMS_ERR_INVALID_CAMERA_ID = 1000431;				// 摄像头id无效
	public static final int   SERVER_RET_CMS_ERR_NO_DEVICE = 1000432;						// 找不到设备
	public static final int   SERVER_RET_CMS_ERR_MEDIA_SESSION_EXIST = 1000433;				// 媒体会话已存在
	public static final int   SERVER_RET_CMS_ERR_GRANT_SESSION_EXIST = 1000434;				// 授权会话已存在
	public static final int   SERVER_RET_CMS_ERR_NO_CAMERA_ROW = 1000435;					// 找不到摄像头表
	public static final int   SERVER_RET_CMS_ERR_UNKNOWN_TYPE = 1000436;					// 无效的类型值
	public static final int   SERVER_RET_CMS_ERR_TOO_MANY_GROUP_COUNT = 1000437;			// 用户从属的组太多
	public static final int   SERVER_RET_CMS_ERR_TOO_MANY = 1000438;						// 数量太多
	public static final int   SERVER_RET_CMS_ERR_EXIST_HIGH_USER = 1000439;					// 存在高级别用户 
	public static final int   SERVER_RET_CMS_ERR_REACH_SESSION_LIMIT = 1000440;				// 用户并发登陆数达到上限 
	public static final int   SERVER_RET_CMS_ERR_USER_TIMEOUT = 1000441;					// 用户已过期
	public static final int   SERVER_RET_CMS_ERR_INVALID_MAC_ADDR = 1000442;				// 无效的MAC地
	public static final int   SERVER_RET_CMS_CLIENT_ERROR_END = 1000520;

	public static final int   SERVER_RET_CMS_SERVER_ERROR_BEGIN = 1000520;					// CMS服务协议返回开始，不做返回值判断
	public static final int   SERVER_RET_CMS_ERR_NO_CONNECTION = 1000521;					// 连接不存在
	public static final int   SERVER_RET_CMS_ERR_INVALID_SERVER = 1000522;					// 未在系统中登记的服务
	public static final int   SERVER_RET_CMS_ERR_NO_DOMAIN = 1000523;						// 服务域不存在
	public static final int   SERVER_RET_CMS_ERR_NO_SERVER_BEAN = 1000524;					// 服务对象不存在
	public static final int   SERVER_RET_CMS_ERR_NO_MTS_TO_USE = 1000525;					// 没有MTS可用
	public static final int   SERVER_RET_CMS_ERR_SESSION_DELETE = 1000526;					// 会话已经拆除
	public static final int   SERVER_RET_CMS_ERR_SERVER_RECONNECT = 1000527;				// 功能服务正在重连
	public static final int   SERVER_RET_CMS_ERR_ADD_CAMERA_FAILED = 1000528;				// 添加摄像头失败
	public static final int   SERVER_RET_CMS_ERR_ADD_CLIENT_FAILED = 1000529;				// 添加客户端失败
	public static final int   SERVER_RET_CMS_ERR_DATABASE_ACCESS_FAILED = 1000530;			// 数据库访问失败
	public static final int   SERVER_RET_CMS_ERR_DATABASE_NO_RECORD = 1000531;				// 数据库没有记录
	public static final int   SERVER_RET_CMS_ERR_DATA_TOO_LONG = 1000532;					// 数据太长了
	public static final int   SERVER_RET_CMS_ERR_NO_GROUPS_OF_USER = 1000533;				// 没有找到用户所从属的组
	public static final int   SERVER_RET_CMS_ERR_QUERY_RECORD_FAILED = 1000534;				// 查询录像失败
	public static final int   SERVER_RET_CMS_ERR_OTHER_USER_PLAYBACK = 1000535;				// 其他用户在回放该摄像头
	public static final int   SERVER_RET_CMS_ERR_REACH_PU_PLAYBACK_LIMIT = 1000536;			// 达到前端回放地限制
	public static final int   SERVER_RET_CMS_ERR_NO_DMS_TO_USE = 1000537;					// 没有DMS可用
	public static final int   SERVER_RET_CMS_ERR_DEV_GRANT_CHANGED = 1000538;				// 设备授权更改到其他服务
	public static final int   SERVER_RET_CMS_ERR_ADD_DVR_FAILED = 1000539;					// 添加DVR失败
	public static final int   SERVER_RET_CMS_ERR_GRANT_FAILED = 1000540;						// 授权到DMS失败
	public static final int   SERVER_RET_CMS_ERR_SS_PLAYBACK_FAILED = 1000541;				// SS回放失败
	public static final int   SERVER_RET_CMS_ERR_REACH_SYSTEM_LIMIT = 1000542;				// 达到系统上限
	public static final int   SERVER_RET_CMS_ERR_INVALID_DEVICE_PROVIDER = 1000543;			// 无效的设备厂家
	public static final int   SERVER_RET_CMS_ERR_NO_URL = 1000544;							// 没有升级URL
	public static final int   SERVER_RET_CMS_ERR_NO_SS_TO_USE = 1000545;						// 没有SS可用
	public static final int   SERVER_RET_CMS_ERR_PU_QUERY_TIMEOUT = 1000546;					// 前端查询超时
	public static final int   SERVER_RET_CMS_ERR_PU_QUERY_RECORD_FAILED = 1000547;			// 前端查询录像失败
	public static final int   SERVER_RET_CMS_ERR_NO_MTS_FOR_DEVICE = 1000548;				// 没有和这个设备管理的MTS
	public static final int   SERVER_RET_CMS_ERR_DEVICE_IN_TALKING = 1000549;				// 设备正在进行语音对讲
	public static final int   SERVER_RET_CMS_ERR_DEVICE_NOT_TALKING = 1000550;				// 设备没有在进行语音对讲
	public static final int   SERVER_RET_CMS_ERR_ENCODE_PDU = 1000551;						// CMS在准备应答时候，进行Encode操作失败
	public static final int   SERVER_RET_CMS_ERR_DECODE_PDU = 1000552;						// CMS在准备应答时候，进行Decode操作失败
	public static final int   SERVER_RET_CMS_ERR_NOT_FOUND_LOWER_DOMAIN = 1000553;			// 没有找到下级域
	public static final int   SERVER_RET_CMS_ERR_NOT_LOGIN_LOWER_DOMAIN = 1000554;			// 未登陆下级域
	public static final int   SERVER_RET_CMS_ERR_NO_RIGHT = 1000555;							// 无权限
	public static final int   SERVER_RET_CMS_ERR_QUERY_ALARM_FAILED = 1000556;				// 查询报警失败
	public static final int   SERVER_RET_CMS_ERR_DEIVCE_OFFLINE = 1000557;					// 设备不在线
	public static final int   SERVER_RET_CMS_ERR_LOWER_DOMAIN_EXCEPTION = 1000558;			// 下级域异常
	public static final int   SERVER_RET_CMS_ERR_ALARM_PRE_RECORD_OPENED = 1000559;			// 报警预录已经打开
	public static final int   SERVER_RET_CMS_ERR_RECONNECT_DEVICE = 1000560;					// 功能服务正在重连设备
	public static final int   SERVER_RET_CMS_ERR_SEND_FUN_SVR_REQ_FAIL = 1000561;			// 向功能服务器发送请求失败

	public static final int   SERVER_RET_CMS_ERR_CU_START_RECORD_FAIL = 1000562;				// 开始录像失败
	public static final int   SERVER_RET_CMS_ERR_CU_RECORING_NOW = 1000563;					// 正在录像
	public static final int   SERVER_RET_CMS_ERR_CU_STOP_RECORD_FAIL = 1000564;				// 停止录像失败
	public static final int   SERVER_RET_CMS_ERR_CU_OTHERUSER_RECORDING = 1000565;			// 其他用户正在录像
	public static final int   SERVER_RET_CMS_ERR_CU_START_RECORD_RUNNING = 1000566;			// 开始录像失败，运行中
	public static final int   SERVER_RET_CMS_ERR_CU_START_RECORD_LIMITE = 1000567;			// 开始录像失败，被禁止
	public static final int   SERVER_RET_CMS_ERR_CU_START_RECORD_NO_SS = 1000568;			// 开始录像失败，没有可用的SS
	public static final int   SERVER_RET_CMS_ERR_NO_PES_TO_USE = 1000569;					// 没有可用的PES服务器 
																	 
	public static final int   SERVER_RET_CMS_ERR_UNKNOWN_PROTOCOL = 1000570;					// 不支持的协议类型
	public static final int   SERVER_RET_CMS_ERR_CONFIG_FILE_TIMEOUT = 1000571;				// 组配置文件过期
	public static final int   SERVER_RET_CMS_ERR_NO_BOLCK  = 1000572;						// 无可用的block
	public static final int   SERVER_RET_CMS_ERR_END = 1001000;								// CMS返回结束


	public static final int   SERVER_RET_DMS_ERR_BEGIN = 1001000;					    	// DMS返回开始，不做返回值判断
	public static final int   SERVER_RET_DMS_ERR_HAS_NO_RIGHT = 1001401;						// 没有权限
	public static final int   SERVER_RET_DMS_CLIENT_ERROR_BEGIN = 1001420;					// DMS客户端协议返回开始，不做返回值判断
	public static final int   SERVER_RET_DMS_ERR_NO_PRIVILEGE = 1001421;						// 没有权限
	public static final int   SERVER_RET_DMS_CLIENT_ERROR_END = 1001520;
	
	public static final int   SERVER_RET_DMS_SERVER_ERROR_BEGIN = 1001520;					// DMS服务协议返回开始，不做返回值判断
	public static final int   SERVER_RET_DMS_ERR_PTZ_FAILED = 1001521;						// 云台内部控制出错
	public static final int   SERVER_RET_DMS_ERR_CONFIG_SET_FAILED = 1001522;				// 设备配置内部控制出错
	public static final int   SERVER_RET_DMS_ERR_CONFIG_GET_FAILED = 1001523;				// 设备配置内部控制出错
	public static final int   SERVER_RET_DMS_ERR_CAMERA_OCCUPY = 1001524;					// 摄像头被其他用户锁定
	public static final int   SERVER_RET_DMS_ERR_PTZ_ACCESS_FAILED = 1001525;				// 象云台协商管理模块请求访问失败
	public static final int   SERVER_RET_DMS_ERR_TCP_COMM_NO_CLIENT = 1001526;				// 用户连接没有绑定到授权的客户端
	public static final int   SERVER_RET_DMS_ERR_CLIENT_UNIT_NOT_FOUND = 1001527;			// 没有找到没有添加过的客户端
	public static final int   SERVER_RET_DMS_ERR_DEVICE_NOT_FOUND = 1001528;					// 设备没找到
	public static final int   SERVER_RET_DMS_ERR_PRIVILEGE_NOT_FOUND = 1001529;				// 没有找到授权信息
	public static final int   SERVER_RET_DMS_ERR_UNKNOWN_COMMAND = 1001530;					// 未知命令
	public static final int   SERVER_RET_DMS_ERR_OCCUPY_BY_HIGHER_USER = 1001531;			// 被高级用户占用
	public static final int   SERVER_RET_DMS_ERR_NORMAL_LOCK_FAILED = 1001532;				// 需要Server检查的Lock失败错误
	public static final int   SERVER_RET_DMS_ERR_OCCUPY_BY_OTHER_USER = 1001533;				// 被其他用户占用
	public static final int   SERVER_RET_DMS_ERR_NORMAL_UNLOCK_FAILED = 1001534;				// 需要Server检查的UnLock失败错误
	public static final int   SERVER_RET_DMS_ERR_NO_DEVICE = 1001535;						// 没有设备
	public static final int   SERVER_RET_DMS_ERR_NO_RIGHT = 1001536;						// 没有权限
	public static final int   SERVER_RET_DMS_ERR_NOT_FOUND_LOWER_DOMAIN = 1001537;			// 没有找到下级域
	public static final int   SERVER_RET_DMS_ERR_NOT_LOGIN_LOWER_DOMAIN = 1001538;			// 没有登录下级域
	public static final int   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_ID = 1001539;				// 查询视频诊断ID失败
	public static final int   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_TYPE_COUNT = 1001540;		// 查询视频诊断类型数目失败
	public static final int   SERVER_RET_DMS_ERR_QUERY_DIAGNOSIS_INFO = 1001541;				// 查询视频诊断信息失败
	public static final int   SERVER_RET_DMS_ERR_STOP_QUERY_DIAGNOSIS_INFO = 1001542;		// 停止视频诊断信息查询失败
	public static final int   SERVER_RET_DMS_ERR_START_QUERY_PERSON_COUNT = 1001543;			// 开始查询人数统计信息失败
	public static final int   SERVER_RET_DMS_ERR_QUERY_PERSON_COUNT = 1001544;				// 查询人数统计信息失败
	public static final int   SERVER_RET_DMS_ERR_STOP_QUERY_PERSON_COUNT = 1001545;			// 停止人数统计信息查询失败
	public static final int   SERVER_RET_DMS_ERR_END = 1002000;						    	// DMS返回结束

	public static final int   SERVER_RET_VMS_ERR_BEGIN = 1002000;                
	public static final int   SERVER_RET_VMS_SERVER_ERROR_BEGIN = 1002520;					// VMS服务协议返回开始，不做返回值判断
	public static final int   SERVER_RET_VMS_ERR_FAILED = 1002520;							// 失败-其他原因
	public static final int   SERVER_RET_VMS_ERR_ID_ALREADY_EXIST = 1002521;					// NVD ID已存在
	public static final int   SERVER_RET_VMS_ERR_INVALID_ID = 1002522;						// 无效的ID
	public static final int   SERVER_RET_VMS_ERR_REACH_LIMIT = 1002523;						// 达到上限
	public static final int   SERVER_RET_VMS_ERR_END = 1003000;						    	// VMS返回结束


	public static final int   SERVER_RET_RTSP_ERR_BEGIN = 1003000;  
	public static final int   SERVER_RET_RTSP_ERR_SETUP_FAILED = 1003503;					// Rtsp建立失败
	public static final int   SERVER_RET_RTSP_SERVER_ERROR_BEGIN  = 1003520;					
	public static final int   SERVER_RET_RTSP_ERR_RECONNECT_DEVICE  = 1003521;				// 正在重连设备
	public static final int   SERVER_RET_RTSP_ERR_END = 1004000;						    	// RTSP返回结束

	public static final int   SERVER_RET_ALARM_ERR_BEGIN = 1004720;                
	public static final int   SERVER_RET_ALARM_ERR_URL = 1004721;							// 无效的URL
	public static final int   SERVER_RET_ALARM_ERR_RES = 1004722;							// 无效的数据
	public static final int   SERVER_RET_ALARM_ERR_MDL_TYPE = 1004723;						// 无效的单元类型
	public static final int   SERVER_RET_ALARM_ERR_SCHEME_INDEX = 1004724;					// 无效的预案索引
	public static final int   SERVER_RET_ALARM_ERR_SCHEME_TYPE = 1004725;					// 无效的预案类型
	public static final int   SERVER_RET_ALARM_ERR_SCHEME_STRING = 1004726;					// 预案字符串解析失败
	public static final int   SERVER_RET_ALARM_ERR_ALARM_NODE = 1004727;						// 无效的报警节点
	public static final int   SERVER_RET_ALARM_ERR_END = 1004820;					    	// 报警返回结束


	public static final int   SERVER_RET_MS_ERR_BEGIN = 1005000;                
	public static final int   SERVER_RET_MS_CLIENT_ERROR_BEGIN = 1005420;
	public static final int   SERVER_RET_MS_ERR_ALREADY_LOGIN = 1005421;						// 已经登录
	public static final int   SERVER_RET_MS_ERR_INVALID_SESSION_ID = 1005422;				// 无效的会话ID
	public static final int   SERVER_RET_MS_ERR_NOT_LOGIN = 1005423;							// 未登录
	public static final int   SERVER_RET_MS_ERR_INVALID_CONNECTION = 1005424;				// 无效连接
	public static final int   SERVER_RET_MS_ERR_INVALID_DEV_TYPE = 1005425;					// 无效的设备类型
	public static final int   SERVER_RET_MS_ERR_INVALID_CAMERA_ID = 1005426;					// 无效的摄像头id
	public static final int   SERVER_RET_MS_ERR_CAMERA_SESSION_EXIST = 1005427;				// 摄像头已经添加过
	public static final int   SERVER_RET_MS_ERR_NO_CAMERA_SESSION = 1005428;					// 摄像头会话不存在
	public static final int   SERVER_RET_MS_ERR_FIND_SAME_TOKEN = 1005429;					// 找到相同的token
	public static final int   SERVER_RET_MS_ERR_UNKNOWN_RECORD_TYPE = 1005430;				// 无法识别的录像类型
	public static final int   SERVER_RET_MS_ERR_INVALID_FILE_NAME = 1005431;					// 无效的录像文件名称
	public static final int   SERVER_RET_MS_ERR_INVALID_TIME_VALUE = 1005432;				// 无效的录像时间值
	public static final int   SERVER_RET_MS_ERR_NOT_FOUND_SESSION = 1005433;					// 没有找到会话
	public static final int   SERVER_RET_MS_ERR_INVALID_RTSP_URL = 1005434;					// 无效的RTSP URL
	public static final int   SERVER_RET_MS_ERR_PLAN_EXIST = 1005435;						// 计划已经存在
	public static final int   SERVER_RET_MS_CLIENT_ERROR_END = 1005520;

	public static final int   SERVER_RET_MS_SERVER_ERROR_BEGIN = 1005520;
	public static final int   SERVER_RET_MS_ERR_DEV_NOT_LOGIN = 1005521;						// 设备还未登录
	public static final int   SERVER_RET_MS_ERR_SDK_OPERATE_FAILED = 1005522;				// sdk调用失败
	public static final int   SERVER_RET_MS_ERR_SESSION_USE_OUT = 1005523;					// 会话用完
	public static final int   SERVER_RET_MS_ERR_RTSP_CONNECT_FAILED = 1005524;				// rtsp连接失败
	public static final int   SERVER_RET_MS_ERR_RTP_LISTEN_FAILED = 1005525;					// RTP侦听失败
	public static final int   SERVER_RET_MS_ERR_RTSP_SETUP_FAILED = 1005526;					// RTSP Setup操作失败
	public static final int   SERVER_RET_MS_ERR_RTSP_PLAY_FAILED = 1005527;					// RTSP PLAY操作失败
	public static final int   SERVER_RET_MS_ERR_ADD_RTP_SESSION_FAILED = 1005528;			// 添加RTP SESSION到serverbase失败
	public static final int   SERVER_RET_MS_ERR_DISK_SPACE_NOT_ENOUGH = 1005529;				// 磁盘空间不足
	public static final int   SERVER_RET_MS_ERR_OPEN_FILE_FAILED = 1005530;					// 文件打开失败
	public static final int   SERVER_RET_MS_ERR_NOT_FOUND_RTSP_CLIENT = 1005531;				// 找不到RTSP客户端连接
	public static final int   SERVER_RET_MS_ERR_RTSP_DISCONNECTED = 1005532;					// RTSP连接断开
	public static final int   SERVER_RET_MS_ERR_RECORD_QUERY_TIMEOUT = 1005533;				// 录像查询超时
	public static final int   SERVER_RET_MS_ERR_SDK_CALLBACK_INVALID_DATA = 1005534;			// sdk 返回数据不正确
	public static final int   SERVER_RET_MS_ERR_SNAP_STORE_PATH_INVALID = 1005535;			// 设置的SS端SNAP存储路径有问题
	public static final int   SERVER_RET_MS_ERR_SNAP_STORE_FILE_FAILED = 1005536;			// SS在存储文件时候操作失败
	public static final int   SERVER_RET_MS_ERR_SNAP_ENCODE_FAILED = 1005537;				// SS在编码回复pdu时候失败
	public static final int   SERVER_RET_MS_ERR_IFRAME_2_BMP = 1005538;						// SS在转换I帧到BMP时候失败
	public static final int   SERVER_RET_MS_ERR_DUPLICATE_PLAN_FOUND = 1005539;				// 重复的PlanId发现
	public static final int   SERVER_RET_MS_ERR_SDK_CALLBACK_TIMEOUT = 1005540;				// SDK调用Callback超时，没有返回数据																						   
	public static final int   SERVER_RET_MS_ERR_NOT_FOUND_SESSION_ID = 1005541;				// 未找到camera_session_id
	public static final int   SERVER_RET_MS_ERR_INVALID_STREAM_TYPE = 1005542;				// 非法的码流类型
	public static final int   SERVER_RET_MS_ERR_ADD_LIVECHANNEL_FAILED = 1005543;			// 添加直播频道失败
	public static final int   SERVER_RET_MS_ERR_GET_TALKDECODE_FAILED = 1005544;				// 获取对讲格式失败
	public static final int   SERVER_RET_MS_ERR_LOGIN_DEV_FAILED = 1005545;					// 登陆语音设备失败
	public static final int   SERVER_RET_MS_ERR_NOT_MATCH_AUDIO_TYPE = 1005546;				// 音频格式不匹配
	public static final int   SERVER_RET_MS_ERR_NOT_FOUND_DISK = 1005547;					// 未找到磁盘
	public static final int   SERVER_RET_MS_ERR_NOT_FOUND_RECORD_PLAN = 1005548;				// 未找到录像计划
	public static final int   SERVER_RET_MS_SERVER_ERROR_END = 1005620;
	public static final int   SERVER_RET_MS_ERR_END = 1006000;								// MS返回结束

	public static final int   SERVER_RET_PCS_ERR_BEGIN = 1006000;							// PCS服务协议返回开始，不做返回值判断
	public static final int   SERVER_RET_PCS_ERR_NOT_FOUND = 1006404;						// 级联设备未下发
	public static final int   SERVER_RET_PCS_ERR_NOT_ACCEPTABLE = 1006406;					// 级联订阅，本级PTS监听失败
	public static final int   SERVER_RET_PCS_ERR_DEVICE_OFFLINE = 1006710;					// 设备断线
	public static final int   SERVER_RET_PCS_ERR_DOMIAN_OFFLINE = 1006713;					// 下级域不在线
	public static final int   SERVER_RET_PCS_ERR_PTS_CANNOT_PING = 1006714;					// 上级连接下级PTS失败
	public static final int   SERVER_RET_PCS_ERR_NO_ACK = 1006715;							// 无应答
	public static final int   SERVER_RET_PCS_ERR_END = 1007000;								// PCS返回结束	
}