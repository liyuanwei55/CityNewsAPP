package com.lyw.zhbj.domin;

import java.util.List;

public class PhotosBean {

	public int retcode;
	public PhotosData data;
	
	public class PhotosData {

		public String countcommenturl;
		public String more;
		public String title;
		public List<PhotosItem> news;
		public List<String> topic;
	}
	
	public class PhotosItem {

		public String comment;
		public String commentlist;
		public String commenturl;
		public String id;
		public String largeimage;
		public String listimage;
		public String pubdate;
		public String smallimage;
		public String title;
		public String type;
		public String url;
		
	}
	
}
/**
 * {
    "data": {
        "countcommenturl": "http://zhbj.qianlong.com/client/content/countComment/",
        "more": "http://zhbj.qianlong.com/static/api/news/10003/list_2.json",
        "news": [
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/72/82772/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/82772",
                "id": 82772,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/11/07/70/476518773M7R.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356JDGO.jpg",
                "pubdate": "2014-11-07 11:40",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/11/07/79/485753989TVL.jpg",
                "title": "������APECѤ��֮ҹ",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/11/07/7743665E4E6B10766F26.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/90/79290/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/79290",
                "id": 79290,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/24/76/47651877XMO1.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356H323.jpg",
                "pubdate": "2014-10-24 14:40",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/24/53/48575398C8VT.jpg",
                "title": "���㿴������صĳ���",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/24/764D6655416111796B20.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/63/79263/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/79263",
                "id": 79263,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/24/23/47651877KIJC.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356PMQ6.jpg",
                "pubdate": "2014-10-24 13:57",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/24/68/48575398CSR8.jpg",
                "title": "���ױ��ǡ��ڳ����ڡ����ɼ�",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/24/754E6D5E4E6E197E672F.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/83/78883/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/78883",
                "id": 78883,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/23/0/153729125094E2.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/153821477101GE.jpg",
                "pubdate": "2014-10-23 10:57",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/23/10/1540061813Y71H.jpg",
                "title": "�й����Ž�������Ƭ����",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/23/704B695B406A1C756921.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/92/78592/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/78592",
                "id": 78592,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/22/55/1649960812RQFY.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/1651807854W6KO.jpg",
                "pubdate": "2014-10-22 14:04",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/22/46/1650884333ZVHP.jpg",
                "title": "Ӱ�Ӿ���桰�����족PK",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/22/72496D5F4F681D75672E.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/75/77775/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/77775",
                "id": 77775,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/20/51/1505891536XYLA.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/5000725356GRE.jpg",
                "pubdate": "2014-10-20 09:25",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/20/31/1485574074U25I.jpg",
                "title": "�Ƽ��������׶��µ���������ɴ�",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/20/714A6F52496C197F6B25.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/96/77596/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/77596",
                "id": 77596,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/17/29/1655501938PR0X.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/1656425459S7CD.jpg",
                "pubdate": "2014-10-17 21:09",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/17/41/165734898034KA.jpg",
                "title": "���������������ֻ����й���",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/17/714A675A486F1F77672A.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/99/77099/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/77099",
                "id": 77099,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/16/62/47651877483X.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356SFJE.jpg",
                "pubdate": "2014-10-16 11:05",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/16/51/485753981NU5.jpg",
                "title": "������· ��������",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/16/764D6855406219716C2E.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/20/76920/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/76920",
                "id": 76920,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/15/75/1678589963DWQY.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/1679513484QXOC.jpg",
                "pubdate": "2014-10-15 21:08",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/15/42/16804370051MYP.jpg",
                "title": "׷�籩���ˣ��ɷ�Ϊ�����ķ籩д��",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/15/72496B574D661D7E6922.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/09/76909/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/76909",
                "id": 76909,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/15/66/15917789896YFY.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/1571461527JCBR.jpg",
                "pubdate": "2014-10-15 19:25",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/15/93/1592702510DM5B.jpg",
                "title": "������ʳ�գ���������в",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/15/72496D514D661071682A.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/55/76755/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/76755",
                "id": 76755,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/15/94/4765187717OI.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356I1TZ.jpg",
                "pubdate": "2014-10-15 13:13",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/15/6/485753986PLS.jpg",
                "title": "�����ڵ���",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/15/754E69554D681A7E6A24.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/50/76750/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/76750",
                "id": 76750,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/15/32/47651877XKBO.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/4672835675CV.jpg",
                "pubdate": "2014-10-15 12:54",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/15/12/48575398U11O.jpg",
                "title": "̽�س��ʸ�������",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/15/714A6D514F6A1F7B6922.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/70/75170/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/75170",
                "id": 75170,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/09/29/16231787037271.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/1159137654MWR8.jpg",
                "pubdate": "2014-10-09 20:05",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/09/13/1622255182BIT1.jpg",
                "title": "�ȴ��ˣ������˱���ż��˯",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/09/704B68574063197F6E25.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/66/74766/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/74766",
                "id": 74766,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/08/1/47651877DPOH.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356PCLM.jpg",
                "pubdate": "2014-10-08 15:24",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/08/18/4857539813M1.jpg",
                "title": "����С������������",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/08/774C6E504C691D7A6D20.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/92/74292/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/74292",
                "id": 74292,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/10/03/80/1536367729LR1Y.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/444689448KDQ5.jpg",
                "pubdate": "2014-10-03 10:40",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/10/03/35/15354442085DEE.jpg",
                "title": "��90�󡱹�������������ɵ�",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/10/03/774C6C524F6F1D756C25.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/81/74181/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/74181",
                "id": 74181,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/09/30/55/2076222180RTEM.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/308245KDDV.jpg",
                "pubdate": "2014-09-30 16:32",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/09/30/84/207529865969U2.jpg",
                "title": "����һ���˵�20��ͼƬ����",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/09/30/72496A5441621F766B21.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/48/73148/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/73148",
                "id": 73148,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/09/26/32/1599167157WN8T.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/160009067810KV.jpg",
                "pubdate": "2014-09-26 13:52",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/09/26/55/16204081400J1C.jpg",
                "title": "�𶶣�ȫ�����������ľ�������",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/09/26/72496D5440631B7E682B.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/51/72851/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/72851",
                "id": 72851,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/09/25/57/476518775JAU.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356GW3I.jpg",
                "pubdate": "2014-09-25 14:49",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/09/25/1/48575398JZCR.jpg",
                "title": "ԭ֭ԭζ�ı�����",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/09/25/704B6B534F65197D6B21.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/14/71414/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/71414",
                "id": 71414,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/09/20/47/16231787033RH7.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/115913765474ZV.jpg",
                "pubdate": "2014-09-20 11:49",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/09/20/56/1622255182UXNV.jpg",
                "title": "���Ѵ�ʦ�ɹ���ս���׸߿�<��������>",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/09/20/774C6B5041671D7D6A25.html"
            },
            {
                "comment": true,
                "commentlist": "http://zhbj.qianlong.com/static/api/news/10003/66/69866/comment_1.json",
                "commenturl": "http://zhbj.qianlong.com/client/user/newComment/69866",
                "id": 69866,
                "largeimage": "http://zhbj.qianlong.com/static/images/2014/09/15/64/47651877KF8W.jpg",
                "listimage": "http://192.168.0.108:8080/zhbj/photos/images/46728356YLZ2.jpg",
                "pubdate": "2014-09-15 11:26",
                "smallimage": "http://zhbj.qianlong.com/static/images/2014/09/15/25/485753981N83.jpg",
                "title": "�����ؾ����⺣�� ���ƴ�Ƭ",
                "type": "news",
                "url": "http://zhbj.qianlong.com/static/html/2014/09/15/764C6F5C4862187F6825.html"
            }
        ],
        "title": "��ͼ",
        "topic": []
    },
    "retcode": 200
}
 */
		
		