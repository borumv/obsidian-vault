---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
Profile-public ^AnT3h6OV

userId
nickname
firstname
lastname
... ^NLlCqUyn

Profile-private ^jJ0BEIuH

userId
email
phoneNumber
password* ^YsO8Zbj1

Profile-follow
 ^1tjbOQM5

userId
followers
following ^4MCFMBkB

Profile-permissions ^TB9nxPrQ

userId
isClosedAccount
blackList
isMessageWithNoFollower ^xbtURN3c

AUTH  ^5caJrF3o

SEARCH ^Xw7joFtk

Posts ^78rfxo6C

userId
postId
date
image
... ^SgEembVz

Comments ^LRIluxrH

userId
commentId
postId
parentComment
comment

 ^BB3tcKcJ

CHAT ^9pR7cWBI

Auth controller ^Z9fBcUQg

Auth Agregate ^yra6fklo

Handle
UserCreatedEvent ^MmYbVOv8

Profile
Microservice ^7zhX85lw

Profile
permissions ^FOc6KgmU

Auth Saga ^RV8ehO1g

ReserveProfileCommand ^CeJWdQgu

ProfileReservedEvent ^8MfMjKXP

ProfilePermissionsCommand ^oGDTiznC

ProfilePermissionsEvent ^QWUqb6DA

REGISTRATE ^AngHYN3S

CreateUserRestModel registerUserRestModel ^QVx545qH

RegisterUserCommand registerUserCommand  ^QQqChpdY

@CommandHandler ^kpdFFpbV

       UserRegisteredEvent userRegisterEvent = new UserRegisteredEvent(
                registerUserCommand.getUserId(),
                registerUserCommand.getEmail(),
                registerUserCommand.getNickName(),
                registerUserCommand.getFirstName(),
                registerUserCommand.getLastName(),
                registerUserCommand.getPassword(),
                registerUserCommand.getDateOfRegistry());
        BeanUtils.copyProperties(registerUserCommand, userRegisterEvent);
        AggregateLifecycle.apply(userRegisterEvent); ^6FIUTd3X

Interseptors ^x9oTUBy8

@EventSourcingHandler ^LN0UTpv2

public void on(UserRegisteredEvent event) {
        this.email = event.email();
        this.nickName = event.nickName();
        this.firstName = event.firstName();
        this.lastName = event.lastName();
        this.password = event.password();
        this.dateOfRegistry = event.dateOfRegistry();
    } ^WC67BXCr

 @EventHandler ^UXuJonWl

 @EventHandler ^WkGQV7El

 @EventHandler ^BRizmjFb

%%
# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/1.8.18",
	"elements": [
		{
			"type": "rectangle",
			"version": 262,
			"versionNonce": 987620888,
			"isDeleted": false,
			"id": "75-1DUlAqeFdMlRGwCj-M",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -96.72348898714768,
			"y": -71.72438891050268,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 1784535304,
			"groupIds": [
				"O2XqZndjL-Iu-KP3KtHkf"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "vPwO1Ha6XkGDrRSkDZLXz",
					"type": "arrow"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 240,
			"versionNonce": 1458382696,
			"isDeleted": false,
			"id": "AnT3h6OV",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -67.72348898714768,
			"y": -64.72438891050268,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 122.47984313964844,
			"height": 24,
			"seed": 881640824,
			"groupIds": [
				"O2XqZndjL-Iu-KP3KtHkf"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Profile-public",
			"rawText": "Profile-public",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile-public"
		},
		{
			"type": "text",
			"version": 303,
			"versionNonce": 929653528,
			"isDeleted": false,
			"id": "NLlCqUyn",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -35.723488987147675,
			"y": -37.72438891050268,
			"strokeColor": "#a61e4d",
			"backgroundColor": "transparent",
			"width": 47.757293701171875,
			"height": 60,
			"seed": 1782682120,
			"groupIds": [
				"O2XqZndjL-Iu-KP3KtHkf"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\nnickname\nfirstname\nlastname\n...",
			"rawText": "userId\nnickname\nfirstname\nlastname\n...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\nnickname\nfirstname\nlastname\n..."
		},
		{
			"type": "rectangle",
			"version": 365,
			"versionNonce": 1487141480,
			"isDeleted": false,
			"id": "Ux1wjuyx797reI6HtYvnU",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 201.61907251782395,
			"y": -68.68036168568054,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 559760760,
			"groupIds": [
				"OILQd7pckDu8trCOxdp0C"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "vPwO1Ha6XkGDrRSkDZLXz",
					"type": "arrow"
				},
				{
					"id": "3GObDHq6bi1YsyXU-jirh",
					"type": "arrow"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 357,
			"versionNonce": 1870479384,
			"isDeleted": false,
			"id": "jJ0BEIuH",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 230.61907251782395,
			"y": -61.68036168568054,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 140.29983520507812,
			"height": 24,
			"seed": 572386824,
			"groupIds": [
				"OILQd7pckDu8trCOxdp0C"
			],
			"roundness": null,
			"boundElements": [
				{
					"id": "v7QeRhR7Dfb8jiTR0vgbc",
					"type": "arrow"
				},
				{
					"id": "q_bO3d2aazCbCrUjnTeNr",
					"type": "arrow"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Profile-private",
			"rawText": "Profile-private",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile-private"
		},
		{
			"type": "text",
			"version": 447,
			"versionNonce": 1107848552,
			"isDeleted": false,
			"id": "YsO8Zbj1",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 262.61907251782395,
			"y": -34.68036168568054,
			"strokeColor": "#a61e4d",
			"backgroundColor": "transparent",
			"width": 61.67472839355469,
			"height": 48,
			"seed": 159766136,
			"groupIds": [
				"OILQd7pckDu8trCOxdp0C"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\nemail\nphoneNumber\npassword*",
			"rawText": "userId\nemail\nphoneNumber\npassword*",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\nemail\nphoneNumber\npassword*"
		},
		{
			"type": "rectangle",
			"version": 431,
			"versionNonce": 319651096,
			"isDeleted": false,
			"id": "9_JlSO9ypU9KUNktvUX7j",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -97.81753815473667,
			"y": 44.75621896318847,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 736722184,
			"groupIds": [
				"MvVD-JuT0WweNNYPGcT0h"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 444,
			"versionNonce": 208044136,
			"isDeleted": false,
			"id": "1tjbOQM5",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -68.81753815473667,
			"y": 51.75621896318847,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 125.99984741210938,
			"height": 48,
			"seed": 583310344,
			"groupIds": [
				"MvVD-JuT0WweNNYPGcT0h"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Profile-follow\n",
			"rawText": "Profile-follow\n",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile-follow\n"
		},
		{
			"type": "text",
			"version": 539,
			"versionNonce": 864950808,
			"isDeleted": false,
			"id": "4MCFMBkB",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -36.81753815473667,
			"y": 78.75621896318847,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 44.52943420410156,
			"height": 36,
			"seed": 1315506296,
			"groupIds": [
				"MvVD-JuT0WweNNYPGcT0h"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\nfollowers\nfollowing",
			"rawText": "userId\nfollowers\nfollowing",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\nfollowers\nfollowing"
		},
		{
			"type": "rectangle",
			"version": 458,
			"versionNonce": 663368552,
			"isDeleted": false,
			"id": "IUasNozjgIpE2jSo4dfI9",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -106.45447751566684,
			"y": -224.9835988720243,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 1373693704,
			"groupIds": [
				"xDiJW_tiJcOXYIwlDa001"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 507,
			"versionNonce": 334698264,
			"isDeleted": false,
			"id": "TB9nxPrQ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -91.45447751566684,
			"y": -215.9835988720243,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 154.2110595703125,
			"height": 20.4,
			"seed": 1716186488,
			"groupIds": [
				"xDiJW_tiJcOXYIwlDa001"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 17.603283865560172,
			"fontFamily": 1,
			"text": "Profile-permissions",
			"rawText": "Profile-permissions",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile-permissions"
		},
		{
			"type": "text",
			"version": 578,
			"versionNonce": 700417640,
			"isDeleted": false,
			"id": "xbtURN3c",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -45.45447751566684,
			"y": -190.9835988720243,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 124.62796020507812,
			"height": 48,
			"seed": 708757000,
			"groupIds": [
				"xDiJW_tiJcOXYIwlDa001"
			],
			"roundness": null,
			"boundElements": [
				{
					"id": "3GObDHq6bi1YsyXU-jirh",
					"type": "arrow"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\nisClosedAccount\nblackList\nisMessageWithNoFollower",
			"rawText": "userId\nisClosedAccount\nblackList\nisMessageWithNoFollower",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\nisClosedAccount\nblackList\nisMessageWithNoFollower"
		},
		{
			"type": "rectangle",
			"version": 145,
			"versionNonce": 2024829976,
			"isDeleted": false,
			"id": "_ThDhnJvkVVt0us1XG2OG",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 167.38709677419354,
			"y": -217.9508568548387,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 255,
			"height": 92,
			"seed": 1340174968,
			"groupIds": [
				"ickJOjl0ibgLn6zgf8M_k"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "v7QeRhR7Dfb8jiTR0vgbc",
					"type": "arrow"
				},
				{
					"id": "q_bO3d2aazCbCrUjnTeNr",
					"type": "arrow"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 120,
			"versionNonce": 2144500072,
			"isDeleted": false,
			"id": "5caJrF3o",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 259.48387096774195,
			"y": -184.5960181451613,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 64.49996948242188,
			"height": 24,
			"seed": 527994488,
			"groupIds": [
				"ickJOjl0ibgLn6zgf8M_k"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "AUTH ",
			"rawText": "AUTH ",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "AUTH "
		},
		{
			"type": "rectangle",
			"version": 141,
			"versionNonce": 2008690968,
			"isDeleted": false,
			"id": "2sw9aXvvcmsBEVactFpSN",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 163.25002442471668,
			"y": 227.7821861270321,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 247,
			"height": 101,
			"seed": 26773000,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "Xw7joFtk"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 88,
			"versionNonce": 487525480,
			"isDeleted": false,
			"id": "Xw7joFtk",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 248.64004670254872,
			"y": 266.2821861270321,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 76.21995544433594,
			"height": 24,
			"seed": 2116847368,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "SEARCH",
			"rawText": "SEARCH",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "2sw9aXvvcmsBEVactFpSN",
			"originalText": "SEARCH"
		},
		{
			"type": "rectangle",
			"version": 294,
			"versionNonce": 1216630296,
			"isDeleted": false,
			"id": "Trdzio71eq911zN6ADgiq",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -379.0967741935484,
			"y": 234.51688508064518,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 1865783160,
			"groupIds": [
				"h4LlQt7zlH8eIul3_Yzdg"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 451,
			"versionNonce": 725696360,
			"isDeleted": false,
			"id": "78rfxo6C",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -350.0967741935484,
			"y": 241.51688508064518,
			"strokeColor": "#4f1f0c",
			"backgroundColor": "transparent",
			"width": 57.31993103027344,
			"height": 24,
			"seed": 2049686536,
			"groupIds": [
				"h4LlQt7zlH8eIul3_Yzdg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Posts",
			"rawText": "Posts",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Posts"
		},
		{
			"type": "text",
			"version": 454,
			"versionNonce": 335727384,
			"isDeleted": false,
			"id": "SgEembVz",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -318.0967741935484,
			"y": 268.5168850806452,
			"strokeColor": "#660b2a",
			"backgroundColor": "transparent",
			"width": 34.259063720703125,
			"height": 60,
			"seed": 1552148600,
			"groupIds": [
				"h4LlQt7zlH8eIul3_Yzdg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\npostId\ndate\nimage\n...",
			"rawText": "userId\npostId\ndate\nimage\n...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\npostId\ndate\nimage\n..."
		},
		{
			"type": "rectangle",
			"version": 265,
			"versionNonce": 984945256,
			"isDeleted": false,
			"id": "61KAtoWec2OGR17lYEB44",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -154,
			"y": 231.2265625,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 180,
			"height": 103,
			"seed": 1280345976,
			"groupIds": [
				"iNZp8jVF0T_FW499bcOG1"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 430,
			"versionNonce": 1151969304,
			"isDeleted": false,
			"id": "LRIluxrH",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -125,
			"y": 238.2265625,
			"strokeColor": "#4f1f0c",
			"backgroundColor": "transparent",
			"width": 91.71990966796875,
			"height": 24,
			"seed": 1148701704,
			"groupIds": [
				"iNZp8jVF0T_FW499bcOG1"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Comments",
			"rawText": "Comments",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Comments"
		},
		{
			"type": "text",
			"version": 476,
			"versionNonce": 1916175720,
			"isDeleted": false,
			"id": "BB3tcKcJ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -93,
			"y": 265.2265625,
			"strokeColor": "#660b2a",
			"backgroundColor": "transparent",
			"width": 75.5816650390625,
			"height": 84,
			"seed": 952162424,
			"groupIds": [
				"iNZp8jVF0T_FW499bcOG1"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 10.480576443725283,
			"fontFamily": 1,
			"text": "userId\ncommentId\npostId\nparentComment\ncomment\n\n",
			"rawText": "userId\ncommentId\npostId\nparentComment\ncomment\n\n",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "userId\ncommentId\npostId\nparentComment\ncomment\n\n"
		},
		{
			"type": "rectangle",
			"version": 115,
			"versionNonce": 1449977112,
			"isDeleted": false,
			"id": "x0kfY2ZqHgxCcWgNpQqfu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -312,
			"y": 408.7265625,
			"strokeColor": "#660b2a",
			"backgroundColor": "transparent",
			"width": 282,
			"height": 109,
			"seed": 728505864,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "9pR7cWBI"
				}
			],
			"updated": 1687346149830,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 49,
			"versionNonce": 1058117736,
			"isDeleted": false,
			"id": "9pR7cWBI",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -197.54998016357422,
			"y": 451.2265625,
			"strokeColor": "#660b2a",
			"backgroundColor": "transparent",
			"width": 53.09996032714844,
			"height": 24,
			"seed": 825215608,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149830,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "CHAT",
			"rawText": "CHAT",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "x0kfY2ZqHgxCcWgNpQqfu",
			"originalText": "CHAT"
		},
		{
			"type": "arrow",
			"version": 124,
			"versionNonce": 650150424,
			"isDeleted": false,
			"id": "v7QeRhR7Dfb8jiTR0vgbc",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 286.9101527250617,
			"y": -111.99594552726671,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 2.9142567565717172,
			"height": 35.66104595526704,
			"seed": 1015893311,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "_ThDhnJvkVVt0us1XG2OG",
				"focus": 0.10123234347559511,
				"gap": 13.954911327571978
			},
			"endBinding": {
				"elementId": "jJ0BEIuH",
				"focus": -0.1232430003824552,
				"gap": 14.654537886319133
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					2.9142567565717172,
					35.66104595526704
				]
			]
		},
		{
			"type": "arrow",
			"version": 76,
			"versionNonce": 85085032,
			"isDeleted": false,
			"id": "q_bO3d2aazCbCrUjnTeNr",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 322.68234429963525,
			"y": -74.40187523392834,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 1.0960365191531878,
			"height": 44.35965547658796,
			"seed": 1776005951,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "jJ0BEIuH",
				"focus": 0.31904372518716734,
				"gap": 12.721513548247799
			},
			"endBinding": {
				"elementId": "_ThDhnJvkVVt0us1XG2OG",
				"focus": -0.1973390002944618,
				"gap": 7.1893261443223935
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					-1.0960365191531878,
					-44.35965547658796
				]
			]
		},
		{
			"type": "arrow",
			"version": 95,
			"versionNonce": 1150844696,
			"isDeleted": false,
			"id": "vPwO1Ha6XkGDrRSkDZLXz",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 192.49728278307006,
			"y": -23.413167177001213,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 103.70468559434035,
			"height": 0.2695540770362328,
			"seed": 1477960657,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "Ux1wjuyx797reI6HtYvnU",
				"focus": 0.11151337101555697,
				"gap": 9.121789734753861
			},
			"endBinding": {
				"elementId": "75-1DUlAqeFdMlRGwCj-M",
				"focus": -0.07164740955434949,
				"gap": 5.516086175877376
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					-103.70468559434035,
					-0.2695540770362328
				]
			]
		},
		{
			"type": "arrow",
			"version": 232,
			"versionNonce": 1317314152,
			"isDeleted": false,
			"id": "3GObDHq6bi1YsyXU-jirh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 190.63110431230683,
			"y": -80.15525761112366,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 121.25971043646899,
			"height": 58.69137564955966,
			"seed": 1676154143,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "Ux1wjuyx797reI6HtYvnU",
				"focus": 0.1532951552489362,
				"gap": 15.887374918003502
			},
			"endBinding": {
				"elementId": "xbtURN3c",
				"focus": 0.05022974428682677,
				"gap": 4.136965611340969
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					-121.25971043646899,
					-58.69137564955966
				]
			]
		},
		{
			"type": "rectangle",
			"version": 110,
			"versionNonce": 1080613912,
			"isDeleted": false,
			"id": "VP5abS2Fgy6LNGsw68qVS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -127.95483870967746,
			"y": -102.33089717741933,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 223.19999999999993,
			"height": 264.79999999999995,
			"seed": 1644678527,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "ellipse",
			"version": 129,
			"versionNonce": 2083819880,
			"isDeleted": false,
			"id": "nK-BHlVf96QsETNDQRIqg",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -459.7328967862411,
			"y": -320.56750808022343,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 1105.5603522251417,
			"height": 950.1182173941185,
			"seed": 1610089777,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 80,
			"versionNonce": 2082838808,
			"isDeleted": false,
			"id": "mLuOOSvY3YKv49jO1XdzL",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -57.95686242531474,
			"y": 734.3431597617756,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 347.5616273188044,
			"height": 530.9484156025957,
			"seed": 1720073727,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "JiO5b_84QDb2E8xdMkHVm",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 188,
			"versionNonce": 1970152552,
			"isDeleted": false,
			"id": "T2W_P2uwEjE1sxh-AWm_w",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -860.9976131321049,
			"y": 870.6449863214042,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 272.46037116448986,
			"height": 209.58490089576128,
			"seed": 1464895199,
			"groupIds": [
				"than804PEGxgVZ3zcizHX"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "cTTzTOqNIOAC57-RkIqqb",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 203,
			"versionNonce": 2067969560,
			"isDeleted": false,
			"id": "Z9fBcUQg",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -845.2787455649227,
			"y": 954.4789466797087,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 239.6499481201172,
			"height": 38.4,
			"seed": 899455185,
			"groupIds": [
				"than804PEGxgVZ3zcizHX"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 32.57446849300831,
			"fontFamily": 1,
			"text": "Auth controller",
			"rawText": "Auth controller",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Auth controller"
		},
		{
			"type": "rectangle",
			"version": 198,
			"versionNonce": 1476220776,
			"isDeleted": false,
			"id": "HBm-AmdZPoUckcQQuqP0H",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -507.12174863014957,
			"y": 868.8984454806063,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 272.46037116448986,
			"height": 209.58490089576128,
			"seed": 479197855,
			"groupIds": [
				"xFXSZWZz239DdFLfCmUJW"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "cTTzTOqNIOAC57-RkIqqb",
					"type": "arrow"
				},
				{
					"id": "JiO5b_84QDb2E8xdMkHVm",
					"type": "arrow"
				},
				{
					"id": "ViwoBr3FaPbXavCOvfabI",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 224,
			"versionNonce": 850670360,
			"isDeleted": false,
			"id": "yra6fklo",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -491.40288106296725,
			"y": 952.7324058389107,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 234.4061737060547,
			"height": 38.4,
			"seed": 813286097,
			"groupIds": [
				"xFXSZWZz239DdFLfCmUJW"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 32.57446849300831,
			"fontFamily": 1,
			"text": "Auth Agregate",
			"rawText": "Auth Agregate",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Auth Agregate"
		},
		{
			"type": "arrow",
			"version": 39,
			"versionNonce": 674114152,
			"isDeleted": false,
			"id": "cTTzTOqNIOAC57-RkIqqb",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -581.2214424829657,
			"y": 979.137601823892,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 72.72727272727286,
			"height": 0,
			"seed": 673253457,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "T2W_P2uwEjE1sxh-AWm_w",
				"focus": 0.035309462072818654,
				"gap": 7.315799484649403
			},
			"endBinding": {
				"elementId": "HBm-AmdZPoUckcQQuqP0H",
				"focus": -0.05197612873948459,
				"gap": 1.3724211255432692
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					72.72727272727286,
					0
				]
			]
		},
		{
			"type": "arrow",
			"version": 41,
			"versionNonce": 1491996696,
			"isDeleted": false,
			"id": "JiO5b_84QDb2E8xdMkHVm",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -206.67598793751105,
			"y": 971.8648745511648,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 136.36363636363623,
			"height": 3.6630884957098715,
			"seed": 791356945,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "HBm-AmdZPoUckcQQuqP0H",
				"focus": 0.024081614438147936,
				"gap": 27.98538952814863
			},
			"endBinding": {
				"elementId": "mLuOOSvY3YKv49jO1XdzL",
				"focus": 0.13554219127209138,
				"gap": 12.355489148560082
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					136.36363636363623,
					-3.6630884957098715
				]
			]
		},
		{
			"type": "rectangle",
			"version": 68,
			"versionNonce": 13409640,
			"isDeleted": false,
			"id": "7KWMDCXqeS25sNmnuQUSy",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -30.31235157387482,
			"y": 771.8648745511648,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 296.3636363636365,
			"height": 94.5454545454545,
			"seed": 287658961,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 88,
			"versionNonce": 904154392,
			"isDeleted": false,
			"id": "oOwWCEjfIWlK0eyaDDS9Y",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -31.221442482965813,
			"y": 970.046692732983,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 296.3636363636365,
			"height": 94.5454545454545,
			"seed": 777958897,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "zrYa0U39C7UtGe3CPwVwA",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 111,
			"versionNonce": 1126477928,
			"isDeleted": false,
			"id": "5-zJG2OFQjIQdTgx98lmP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -25.766897028420544,
			"y": 1160.9557836420738,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 296.3636363636365,
			"height": 94.5454545454545,
			"seed": 1954848159,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "sveEtDSnGkpEhoE16dyih",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 166,
			"versionNonce": 1930095128,
			"isDeleted": false,
			"id": "0-8sOGu4klb-EWCYuOkR2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -16.675987937511536,
			"y": 875.5012381875285,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 265.4545454545457,
			"height": 84.68488566648077,
			"seed": 1090186449,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "p-TW0ayB3Qm2CsAuraS55",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 222,
			"versionNonce": 1191338856,
			"isDeleted": false,
			"id": "Zg4iZwZqcDkWWoJ5NM2cJ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -8.494169755693179,
			"y": 1073.158795354288,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 265.4545454545457,
			"height": 84.68488566648077,
			"seed": 7439825,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 54,
			"versionNonce": 1800791832,
			"isDeleted": false,
			"id": "MmYbVOv8",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 35.142193880670675,
			"y": 802.7739654602558,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 179.57984924316406,
			"height": 48,
			"seed": 801995935,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Handle\nUserCreatedEvent",
			"rawText": "Handle\nUserCreatedEvent",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Handle\nUserCreatedEvent"
		},
		{
			"type": "rectangle",
			"version": 80,
			"versionNonce": 179418728,
			"isDeleted": false,
			"id": "_MXD_Rhc_481pC0SmaEej",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 467.8694666079434,
			"y": 779.1376018238923,
			"strokeColor": "#364fc7",
			"backgroundColor": "transparent",
			"width": 350.90909090909076,
			"height": 150.90909090909076,
			"seed": 1500904849,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "p-TW0ayB3Qm2CsAuraS55",
					"type": "arrow"
				},
				{
					"id": "zrYa0U39C7UtGe3CPwVwA",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 123,
			"versionNonce": 2067350552,
			"isDeleted": false,
			"id": "tnmpMSjH1n7Mo9PquaNHZ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 477.8694666079433,
			"y": 1016.4103290966193,
			"strokeColor": "#364fc7",
			"backgroundColor": "transparent",
			"width": 350.90909090909076,
			"height": 150.90909090909076,
			"seed": 2031184657,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "mUuug0V4zDtRJ8ctJqiL2",
					"type": "arrow"
				},
				{
					"id": "sveEtDSnGkpEhoE16dyih",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 54,
			"versionNonce": 1660856680,
			"isDeleted": false,
			"id": "7zhX85lw",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 534.7026145238706,
			"y": 810.846692732983,
			"strokeColor": "#364fc7",
			"backgroundColor": "transparent",
			"width": 208.15188598632812,
			"height": 86.39999999999999,
			"seed": 820631793,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "Profile\nMicroservice",
			"rawText": "Profile\nMicroservice",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile\nMicroservice"
		},
		{
			"type": "text",
			"version": 42,
			"versionNonce": 1353253144,
			"isDeleted": false,
			"id": "FOc6KgmU",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 570.7951528373023,
			"y": 1051.8648745511648,
			"strokeColor": "#364fc7",
			"backgroundColor": "transparent",
			"width": 186.8759002685547,
			"height": 86.39999999999999,
			"seed": 1693430207,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "Profile\npermissions",
			"rawText": "Profile\npermissions",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Profile\npermissions"
		},
		{
			"type": "text",
			"version": 48,
			"versionNonce": 724909160,
			"isDeleted": false,
			"id": "RV8ehO1g",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 4.710571982366218,
			"y": 682.773965460256,
			"strokeColor": "#364fc7",
			"backgroundColor": "transparent",
			"width": 188.13597106933594,
			"height": 43.199999999999996,
			"seed": 2079947839,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "Auth Saga",
			"rawText": "Auth Saga",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Auth Saga"
		},
		{
			"type": "text",
			"version": 65,
			"versionNonce": 991501848,
			"isDeleted": false,
			"id": "CeJWdQgu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1.9041207050668163,
			"y": 910.5557836420738,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 222.83978271484375,
			"height": 24,
			"seed": 894048849,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "ReserveProfileCommand",
			"rawText": "ReserveProfileCommand",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ReserveProfileCommand"
		},
		{
			"type": "text",
			"version": 107,
			"versionNonce": 1965125480,
			"isDeleted": false,
			"id": "8MfMjKXP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 17.39684156910289,
			"y": 1012.5921472784377,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 206.39979553222656,
			"height": 24,
			"seed": 188908465,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "ProfileReservedEvent",
			"rawText": "ProfileReservedEvent",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ProfileReservedEvent"
		},
		{
			"type": "text",
			"version": 113,
			"versionNonce": 2071829272,
			"isDeleted": false,
			"id": "oGDTiznC",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -2.6267603096700896,
			"y": 1106.4103290966193,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 253.7197265625,
			"height": 24,
			"seed": 1564821617,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "mUuug0V4zDtRJ8ctJqiL2",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "ProfilePermissionsCommand",
			"rawText": "ProfilePermissionsCommand",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ProfilePermissionsCommand"
		},
		{
			"type": "text",
			"version": 157,
			"versionNonce": 957301352,
			"isDeleted": false,
			"id": "QWUqb6DA",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 7.646864457286483,
			"y": 1203.5012381875283,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 225.89974975585938,
			"height": 24,
			"seed": 2135600703,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "ProfilePermissionsEvent",
			"rawText": "ProfilePermissionsEvent",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ProfilePermissionsEvent"
		},
		{
			"type": "arrow",
			"version": 68,
			"versionNonce": 340424728,
			"isDeleted": false,
			"id": "p-TW0ayB3Qm2CsAuraS55",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 260.59673933521617,
			"y": 917.3194200057103,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 194.5454545454545,
			"height": 45.454545454545496,
			"seed": 83918321,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "0-8sOGu4klb-EWCYuOkR2",
				"focus": 0.45325781251110275,
				"gap": 11.818181818181984
			},
			"endBinding": {
				"elementId": "_MXD_Rhc_481pC0SmaEej",
				"focus": 0.22924266744491617,
				"gap": 12.727272727272748
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					194.5454545454545,
					-45.454545454545496
				]
			]
		},
		{
			"type": "arrow",
			"version": 56,
			"versionNonce": 97170792,
			"isDeleted": false,
			"id": "mUuug0V4zDtRJ8ctJqiL2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 258.7785575170342,
			"y": 1130.046692732983,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 210.909090909091,
			"height": 29.090909090909236,
			"seed": 618625521,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "oGDTiznC",
				"focus": 1.0236099824921383,
				"gap": 7.685591264204277
			},
			"endBinding": {
				"elementId": "tnmpMSjH1n7Mo9PquaNHZ",
				"focus": 0.16294432211387175,
				"gap": 8.18181818181813
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					210.909090909091,
					-29.090909090909236
				]
			]
		},
		{
			"type": "arrow",
			"version": 94,
			"versionNonce": 427013400,
			"isDeleted": false,
			"id": "zrYa0U39C7UtGe3CPwVwA",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 466.05128478976144,
			"y": 924.5921472784376,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"width": 196.36363636363626,
			"height": 85.4545454545455,
			"seed": 1956310705,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "_MXD_Rhc_481pC0SmaEej",
				"focus": 0.047075131688385584,
				"gap": 1.8181818181819835
			},
			"endBinding": {
				"elementId": "oOwWCEjfIWlK0eyaDDS9Y",
				"focus": 0.5296377193643148,
				"gap": 4.545454545454504
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					-196.36363636363626,
					85.4545454545455
				]
			]
		},
		{
			"type": "arrow",
			"version": 44,
			"versionNonce": 815777896,
			"isDeleted": false,
			"id": "sveEtDSnGkpEhoE16dyih",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 475.1421938806707,
			"y": 1186.4103290966193,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"width": 189.090909090909,
			"height": 41.818181818181756,
			"seed": 1168276095,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "tnmpMSjH1n7Mo9PquaNHZ",
				"focus": -0.4825950577614596,
				"gap": 19.09090909090935
			},
			"endBinding": {
				"elementId": "5-zJG2OFQjIQdTgx98lmP",
				"focus": 0.7019766299006234,
				"gap": 15.454545454545723
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					-189.090909090909,
					41.818181818181756
				]
			]
		},
		{
			"id": "ViwoBr3FaPbXavCOvfabI",
			"type": "arrow",
			"x": -374.4428611408689,
			"y": 1082.2057836420736,
			"width": 17.5,
			"height": 925,
			"angle": 0,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 24706920,
			"version": 120,
			"versionNonce": 7164440,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					17.5,
					925
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "HBm-AmdZPoUckcQQuqP0H",
				"focus": 0.0405482319061104,
				"gap": 3.7224372657059916
			},
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "AngHYN3S",
			"type": "text",
			"x": -561.3228355061033,
			"y": 2395.1057836420737,
			"width": 565.4453125,
			"height": 97.2,
			"angle": 0,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1607668584,
			"version": 77,
			"versionNonce": 89815912,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "cWGjI1kUhcwweAAxOUW5M",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"text": "REGISTRATE",
			"rawText": "REGISTRATE",
			"fontSize": 81.83333333333326,
			"fontFamily": 1,
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "REGISTRATE"
		},
		{
			"id": "cWGjI1kUhcwweAAxOUW5M",
			"type": "arrow",
			"x": 5.557138859131101,
			"y": 2451.350919995908,
			"width": 454.14816284179693,
			"height": 1.6415218465417638,
			"angle": 0,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1767037032,
			"version": 212,
			"versionNonce": 1881886488,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346149831,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					454.14816284179693,
					-1.6415218465417638
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "AngHYN3S",
				"focus": 0.16293279022403273,
				"gap": 1.411757575141678
			},
			"endBinding": {
				"elementId": "QVx545qH",
				"focus": 0.9999999999999957,
				"gap": 1
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "dvMfu-jOejeRBb2QN4ajH",
			"type": "rectangle",
			"x": 413.0571388591311,
			"y": 2402.2057836420736,
			"width": 742.5,
			"height": 137.5,
			"angle": 0,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"B-b7StBTXqD0_CJgo2aoj"
			],
			"roundness": {
				"type": 3
			},
			"seed": 1365160040,
			"version": 50,
			"versionNonce": 1984351848,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "kY6UKkb1mhWxGeRikyIQt",
					"type": "arrow"
				}
			],
			"updated": 1687346149831,
			"link": null,
			"locked": false
		},
		{
			"id": "QVx545qH",
			"type": "text",
			"x": 460.705301700928,
			"y": 2449.7057836420736,
			"width": 614.6611328125,
			"height": 32.4,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"B-b7StBTXqD0_CJgo2aoj"
			],
			"roundness": null,
			"seed": 197358184,
			"version": 74,
			"versionNonce": 287419416,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "cWGjI1kUhcwweAAxOUW5M",
					"type": "arrow"
				}
			],
			"updated": 1687346149832,
			"link": null,
			"locked": false,
			"text": "CreateUserRestModel registerUserRestModel",
			"rawText": "CreateUserRestModel registerUserRestModel",
			"fontSize": 27.671915218230012,
			"fontFamily": 1,
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "CreateUserRestModel registerUserRestModel"
		},
		{
			"id": "kY6UKkb1mhWxGeRikyIQt",
			"type": "arrow",
			"x": 1158.057138859131,
			"y": 2467.2057836420736,
			"width": 457.5,
			"height": 7.5,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 447285096,
			"version": 56,
			"versionNonce": 1278263656,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346149832,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					457.5,
					7.5
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "dvMfu-jOejeRBb2QN4ajH",
				"focus": -0.13198247535596938,
				"gap": 2.5
			},
			"endBinding": {
				"elementId": "MzfUomlUKoY-iAUN3bKc5",
				"focus": -0.05366922234392116,
				"gap": 26.25
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"type": "rectangle",
			"version": 97,
			"versionNonce": 1564764440,
			"isDeleted": false,
			"id": "MzfUomlUKoY-iAUN3bKc5",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1641.807138859131,
			"y": 2408.4557836420736,
			"strokeColor": "#d9480f",
			"backgroundColor": "transparent",
			"width": 742.5,
			"height": 137.5,
			"seed": 1925541224,
			"groupIds": [
				"HF8YAo_xtEy-UHCeRvagk"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "kY6UKkb1mhWxGeRikyIQt",
					"type": "arrow"
				}
			],
			"updated": 1687346149832,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 120,
			"versionNonce": 1449415784,
			"isDeleted": false,
			"id": "QQqChpdY",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1697.7563881267092,
			"y": 2455.9557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 598.0589599609375,
			"height": 32.4,
			"seed": 413170968,
			"groupIds": [
				"HF8YAo_xtEy-UHCeRvagk"
			],
			"roundness": null,
			"boundElements": null,
			"updated": 1687346149832,
			"link": null,
			"locked": false,
			"fontSize": 27.671915218230012,
			"fontFamily": 1,
			"text": "RegisterUserCommand registerUserCommand ",
			"rawText": "RegisterUserCommand registerUserCommand ",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "RegisterUserCommand registerUserCommand "
		},
		{
			"id": "9nHmJE_giIFjCy0LsyyIk",
			"type": "rectangle",
			"x": 1665.5571388591316,
			"y": 3348.2057836420736,
			"width": 855,
			"height": 367.4999999999998,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"jzJ4L7ZVof2EvLSJmqt2G"
			],
			"roundness": {
				"type": 3
			},
			"seed": 772378392,
			"version": 184,
			"versionNonce": 2140399976,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "AK1FCurqW0u7royHUbYRA",
					"type": "arrow"
				},
				{
					"id": "oRD3N7SgFVaWMZhnClHVp",
					"type": "arrow"
				}
			],
			"updated": 1687346242378,
			"link": null,
			"locked": false
		},
		{
			"id": "kpdFFpbV",
			"type": "text",
			"x": 1858.1691994060066,
			"y": 3360.7057836420736,
			"width": 304.77587890625,
			"height": 43.199999999999996,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"jzJ4L7ZVof2EvLSJmqt2G"
			],
			"roundness": null,
			"seed": 971404392,
			"version": 70,
			"versionNonce": 1457531240,
			"isDeleted": false,
			"boundElements": [],
			"updated": 1687346155838,
			"link": null,
			"locked": false,
			"text": "@CommandHandler",
			"rawText": "@CommandHandler",
			"fontSize": 36,
			"fontFamily": 1,
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "@CommandHandler"
		},
		{
			"id": "6FIUTd3X",
			"type": "text",
			"x": 1618.059458195069,
			"y": 3410.7057836420736,
			"width": 846.599609375,
			"height": 264,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"jzJ4L7ZVof2EvLSJmqt2G"
			],
			"roundness": null,
			"seed": 73467416,
			"version": 101,
			"versionNonce": 759143960,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346155839,
			"link": null,
			"locked": false,
			"text": "       UserRegisteredEvent userRegisterEvent = new UserRegisteredEvent(\n                registerUserCommand.getUserId(),\n                registerUserCommand.getEmail(),\n                registerUserCommand.getNickName(),\n                registerUserCommand.getFirstName(),\n                registerUserCommand.getLastName(),\n                registerUserCommand.getPassword(),\n                registerUserCommand.getDateOfRegistry());\n        BeanUtils.copyProperties(registerUserCommand, userRegisterEvent);\n        AggregateLifecycle.apply(userRegisterEvent);",
			"rawText": "       UserRegisteredEvent userRegisterEvent = new UserRegisteredEvent(\n                registerUserCommand.getUserId(),\n                registerUserCommand.getEmail(),\n                registerUserCommand.getNickName(),\n                registerUserCommand.getFirstName(),\n                registerUserCommand.getLastName(),\n                registerUserCommand.getPassword(),\n                registerUserCommand.getDateOfRegistry());\n        BeanUtils.copyProperties(registerUserCommand, userRegisterEvent);\n        AggregateLifecycle.apply(userRegisterEvent);",
			"fontSize": 22.66666666666668,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "       UserRegisteredEvent userRegisterEvent = new UserRegisteredEvent(\n                registerUserCommand.getUserId(),\n                registerUserCommand.getEmail(),\n                registerUserCommand.getNickName(),\n                registerUserCommand.getFirstName(),\n                registerUserCommand.getLastName(),\n                registerUserCommand.getPassword(),\n                registerUserCommand.getDateOfRegistry());\n        BeanUtils.copyProperties(registerUserCommand, userRegisterEvent);\n        AggregateLifecycle.apply(userRegisterEvent);"
		},
		{
			"id": "x1BmYtueGLBezo8GI4IVO",
			"type": "rectangle",
			"x": 1575.5571388591316,
			"y": 2795.7057836420736,
			"width": 857.5,
			"height": 207.5,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"seed": 2124607336,
			"version": 160,
			"versionNonce": 912664936,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "AK1FCurqW0u7royHUbYRA",
					"type": "arrow"
				}
			],
			"updated": 1687346383499,
			"link": null,
			"locked": false
		},
		{
			"id": "iB-RLKwVDFIqFagva5NDv",
			"type": "line",
			"x": 1988.0571388591316,
			"y": 2540.7057836420736,
			"width": 2.5,
			"height": 247.5,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1700934760,
			"version": 36,
			"versionNonce": 1198912280,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346167519,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-2.5,
					247.5
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "AK1FCurqW0u7royHUbYRA",
			"type": "arrow",
			"x": 1983.9365936814106,
			"y": 3023.2057836420736,
			"width": 4.715335664909617,
			"height": 307.5000000000009,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 157837928,
			"version": 203,
			"versionNonce": 632077416,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346383500,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					4.715335664909617,
					307.5000000000009
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "x1BmYtueGLBezo8GI4IVO",
				"focus": 0.051824624245311285,
				"gap": 20
			},
			"endBinding": {
				"elementId": "9nHmJE_giIFjCy0LsyyIk",
				"focus": -0.23545198433558495,
				"gap": 17.49999999999909
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "x9oTUBy8",
			"type": "text",
			"x": 1870.5571388591316,
			"y": 2863.2057836420736,
			"width": 224.24391174316406,
			"height": 43.199999999999996,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 129132904,
			"version": 53,
			"versionNonce": 952679784,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346193945,
			"link": null,
			"locked": false,
			"text": "Interseptors",
			"rawText": "Interseptors",
			"fontSize": 36,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Interseptors"
		},
		{
			"type": "rectangle",
			"version": 222,
			"versionNonce": 1637983256,
			"isDeleted": false,
			"id": "OH7ipOk5-qcl5AympBpzL",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1639.3059791911628,
			"y": 3866.9557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 855,
			"height": 367.4999999999998,
			"seed": 615761688,
			"groupIds": [
				"DsPslrIEqzWBSCid1lOuQ"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "oRD3N7SgFVaWMZhnClHVp",
					"type": "arrow"
				},
				{
					"id": "4UeMb2qwmIQsp-R9hqJ5K",
					"type": "arrow"
				}
			],
			"updated": 1687346255050,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 108,
			"versionNonce": 1742440808,
			"isDeleted": false,
			"id": "LN0UTpv2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1787.6740517009284,
			"y": 3879.4557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 393.26385498046875,
			"height": 43.199999999999996,
			"seed": 111269480,
			"groupIds": [
				"DsPslrIEqzWBSCid1lOuQ"
			],
			"roundness": null,
			"boundElements": null,
			"updated": 1687346224784,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "@EventSourcingHandler",
			"rawText": "@EventSourcingHandler",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "@EventSourcingHandler"
		},
		{
			"type": "text",
			"version": 163,
			"versionNonce": 1720389144,
			"isDeleted": false,
			"id": "WC67BXCr",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1709.3082985271003,
			"y": 3956.9557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 604.341796875,
			"height": 211.2,
			"seed": 232465432,
			"groupIds": [
				"DsPslrIEqzWBSCid1lOuQ"
			],
			"roundness": null,
			"boundElements": null,
			"updated": 1687346237298,
			"link": null,
			"locked": false,
			"fontSize": 22.66666666666668,
			"fontFamily": 1,
			"text": "public void on(UserRegisteredEvent event) {\n        this.email = event.email();\n        this.nickName = event.nickName();\n        this.firstName = event.firstName();\n        this.lastName = event.lastName();\n        this.password = event.password();\n        this.dateOfRegistry = event.dateOfRegistry();\n    }",
			"rawText": "public void on(UserRegisteredEvent event) {\n        this.email = event.email();\n        this.nickName = event.nickName();\n        this.firstName = event.firstName();\n        this.lastName = event.lastName();\n        this.password = event.password();\n        this.dateOfRegistry = event.dateOfRegistry();\n    }",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "public void on(UserRegisteredEvent event) {\n        this.email = event.email();\n        this.nickName = event.nickName();\n        this.firstName = event.firstName();\n        this.lastName = event.lastName();\n        this.password = event.password();\n        this.dateOfRegistry = event.dateOfRegistry();\n    }"
		},
		{
			"id": "oRD3N7SgFVaWMZhnClHVp",
			"type": "arrow",
			"x": 2023.0571388591316,
			"y": 3733.2057836420736,
			"width": 0,
			"height": 130,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1127320344,
			"version": 28,
			"versionNonce": 1661452568,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346242378,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					130
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "9nHmJE_giIFjCy0LsyyIk",
				"focus": 0.16374269005847952,
				"gap": 17.5
			},
			"endBinding": {
				"elementId": "OH7ipOk5-qcl5AympBpzL",
				"focus": -0.1023364686129386,
				"gap": 3.75
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "4UeMb2qwmIQsp-R9hqJ5K",
			"type": "arrow",
			"x": 2510.5571388591316,
			"y": 4038.2057836420736,
			"width": 530,
			"height": 5,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 355228440,
			"version": 58,
			"versionNonce": 380851816,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346255049,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					530,
					5
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "OH7ipOk5-qcl5AympBpzL",
				"focus": -0.088859641279476,
				"gap": 16.25115966796875
			},
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "x-x881Y8atLmrPsFsGan9",
			"type": "rectangle",
			"x": 3075.5571388591316,
			"y": 3840.7057836420736,
			"width": 462.5,
			"height": 122.5,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"PdorIbTa_X7H865vBCNOu"
			],
			"roundness": {
				"type": 3
			},
			"seed": 458153064,
			"version": 51,
			"versionNonce": 1166195992,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346292630,
			"link": null,
			"locked": false
		},
		{
			"id": "UXuJonWl",
			"type": "text",
			"x": 3160.5571388591316,
			"y": 3883.2057836420736,
			"width": 272.69989013671875,
			"height": 43.199999999999996,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [
				"PdorIbTa_X7H865vBCNOu"
			],
			"roundness": null,
			"seed": 1954866200,
			"version": 19,
			"versionNonce": 1457864808,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1687346292630,
			"link": null,
			"locked": false,
			"text": " @EventHandler",
			"rawText": " @EventHandler",
			"fontSize": 36,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": " @EventHandler"
		},
		{
			"type": "rectangle",
			"version": 75,
			"versionNonce": 1237023336,
			"isDeleted": false,
			"id": "DOXjeWjUF8VoGxP9HOzU2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3101.8071388591316,
			"y": 4149.455783642074,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 462.5,
			"height": 122.5,
			"seed": 1032325912,
			"groupIds": [
				"IKzSYTp6TO1oLkI3fAtDf"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1687346302907,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 43,
			"versionNonce": 1570619416,
			"isDeleted": false,
			"id": "WkGQV7El",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3186.8071388591316,
			"y": 4191.955783642074,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 272.69989013671875,
			"height": 43.199999999999996,
			"seed": 1193529960,
			"groupIds": [
				"IKzSYTp6TO1oLkI3fAtDf"
			],
			"roundness": null,
			"boundElements": null,
			"updated": 1687346302907,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": " @EventHandler",
			"rawText": " @EventHandler",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": " @EventHandler"
		},
		{
			"type": "rectangle",
			"version": 81,
			"versionNonce": 2028494696,
			"isDeleted": false,
			"id": "1QVxrQmUrYXASePq2Orsl",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3084.3071388591316,
			"y": 3999.4557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 462.5,
			"height": 122.5,
			"seed": 193390616,
			"groupIds": [
				"VHX43646daky-cL6sSLUO"
			],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1687346300597,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 49,
			"versionNonce": 803056408,
			"isDeleted": false,
			"id": "BRizmjFb",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3169.3071388591316,
			"y": 4041.9557836420736,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 272.69989013671875,
			"height": 43.199999999999996,
			"seed": 47007080,
			"groupIds": [
				"VHX43646daky-cL6sSLUO"
			],
			"roundness": null,
			"boundElements": null,
			"updated": 1687346300597,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": " @EventHandler",
			"rawText": " @EventHandler",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": " @EventHandler"
		}
	],
	"appState": {
		"theme": "light",
		"viewBackgroundColor": "#ffffff",
		"currentItemStrokeColor": "#000000",
		"currentItemBackgroundColor": "transparent",
		"currentItemFillStyle": "hachure",
		"currentItemStrokeWidth": 1,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 1,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 1,
		"currentItemFontSize": 36,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "arrow",
		"scrollX": -422.54126584325877,
		"scrollY": -1869.5729711420736,
		"zoom": {
			"value": 0.4
		},
		"currentItemRoundness": "round",
		"gridSize": null,
		"colorPalette": {},
		"currentStrokeOptions": null,
		"previousGridSize": null
	},
	"files": {}
}
```
%%