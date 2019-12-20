import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OedashComponent } from './oedash.component';

describe('OedashComponent', () => {
  let component: OedashComponent;
  let fixture: ComponentFixture<OedashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OedashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OedashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
