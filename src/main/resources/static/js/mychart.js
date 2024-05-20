const ctx = $("#myChart");
new Chart(ctx, {
    type: 'line',
    data: {
        labels: [1,2,3,4,5,6,7],
        datasets: [{
            label: 'Dataset 1',
            data: [2000, 2200, 2100, 1980, 2030, 2200, 2400],
            fill: false,
            borderColor: 'rgb(192, 52, 52)',
            tension: 0
        }]
    },
    options: {
        responsive: true,
        plugins: {
            legend: {
                position: 'top',
            },
            title: {
                display: true,
                text: 'Chart.js Line Chart'
            }
        }
    },
});