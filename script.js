function addPerson(){
  const row = document.createElement("div");
  row.className="person-row";

  row.innerHTML=`
    <input class="name" placeholder="Name">
    <input class="days" type="number" placeholder="Days">
    <button onclick="this.parentElement.remove()">✕</button>
  `;

  document.getElementById("peopleContainer").appendChild(row);
}

async function calculate(){

  const totalBill = Number(document.getElementById("totalBill").value);
  const names=document.querySelectorAll(".name");
  const days=document.querySelectorAll(".days");

  let people=[];

  for(let i=0;i<names.length;i++){
    people.push({
      name:names[i].value,
      daysStayed:Number(days[i].value)
    });
  }

  const res=await fetch("http://localhost:8081/api/split",{
    method:"POST",
    headers:{ "Content-Type":"application/json"},
    body:JSON.stringify({totalBill,people})
  });

  const data=await res.json();
  show(data);
}

function show(data){

  if(data.error){
    document.getElementById("result").innerHTML=
      `<p class="error">${data.error}</p>`;
    return;
  }

  let html=`<table>
      <tr><th>Name</th><th>Amount (₹)</th></tr>`;

  data.forEach(p=>{
    html+=`
      <tr>
        <td>${p.name}</td>
        <td>${p.amount}</td>
      </tr>`;
  });

  html+=`</table>`;

  document.getElementById("result").innerHTML=html;
}
