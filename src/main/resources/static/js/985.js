// 基于准备好的dom，初始化echarts实例
var Chart985 = echarts.init(document.getElementById('985'));
Chart985.showLoading();  // 开启 loading 效果
let List_985 = [
    {name: "南海诸岛", value: 0},
    {name: '北京市', value: 8},
    {name: '天津市', value: 2},
    {name: '上海市', value: 4},
    {name: '重庆市', value: 1},
    {name: '河北省', value: 1},
    {name: '河南省', value: 0},
    {name: '云南省', value: 0},
    {name: '辽宁省', value: 3},
    {name: '黑龙江省', value: 1},
    {name: '湖南省', value: 3},
    {name: '安徽省', value: 1},
    {name: '山东省', value: 4},
    {name: '新疆维吾尔自治区', value: 0},
    {name: '江苏省', value: 2},
    {name: '浙江省', value: 1},
    {name: '江西省', value: 0},
    {name: '湖北省', value: 2},
    {name: '广西壮族自治区', value: 0},
    {name: '甘肃省', value: 1},
    {name: '山西省', value: 0},
    {name: '内蒙古自治区', value: 0},
    {name: '陕西省', value: 3},
    {name: '吉林省', value: 1},
    {name: '福建省', value: 1},
    {name: '贵州省', value: 0},
    {name: '广东省', value: 3},
    {name: '青海省', value: 0},
    {name: '西藏自治区', value: 0},
    {name: '四川省', value: 3},
    {name: '宁夏回族自治区', value: 0},
    {name: '海南省', value: 0},
    {name: '台湾省', value: 0},
    {name: '香港', value: 0},
    {name: '澳门', value: 0}
]
$.get('../js/China.json', function (chinaJson) {
    echarts.registerMap('china', chinaJson);
    let option={
        title:{
            text:'985分布'
        },
        tooltip: {
            formatter: function (params, ticket, callback) {
                return params.name + "：" + params.value;
            }
        },
        visualMap: {
            min: 0,
            max: 8,
            left: 'left',
            top: 'bottom',
            text: ['多', '少'],//取值范围的文字
            inRange: {
                color: ['#FFFF00', '#FF0000']//取值范围的颜色
            },
            show: true
        },
        series: [{
            name: "985数量",
            type: "map",
            geoIndex: 0,
            data: List_985
        }],
        geo: {
            map: 'china',
            roam: false,
            zoom: 1.2,
            label: {
                normal: {
                    show: false
                },
                emphasis: {
                    color: "#000000"
                }
            },
            itemStyle: {
                normal: {
                    areaColor: '#C9E4CA',
                    borderColor: 'rgba(0, 0, 0, 1)',
                    borderWidth: 0.08,
                },
                emphasis: {
                    areaColor: '#87BBA2',
                    shadowOffsetX: 0,
                    shadowOffsetY: 0,
                    shadowBlur: 20,
                    borderWidth: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }


    };
    Chart985.setOption(option);
    Chart985.hideLoading()

});

